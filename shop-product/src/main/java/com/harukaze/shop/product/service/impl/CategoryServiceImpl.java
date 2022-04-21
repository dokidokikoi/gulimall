package com.harukaze.shop.product.service.impl;

import com.harukaze.shop.product.vo.CategoryVo;
import com.harukaze.shop.product.service.CategoryBrandRelationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.common.utils.Query;

import com.harukaze.shop.product.dao.CategoryDao;
import com.harukaze.shop.product.entity.CategoryEntity;
import com.harukaze.shop.product.service.CategoryService;
import org.springframework.transaction.annotation.Transactional;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    CategoryBrandRelationService categoryBrandRelationService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryVo> listWithTree() {
        // 1.查出所有分类
        List<CategoryEntity> entityList = baseMapper.selectList(new QueryWrapper<>());
        // 2.组成父子结构
        // 2.1.查出一级菜单分类
        return entityList.stream()
                .filter(ele -> ele.getParentCid() == 0)
                .map(ele -> {
                    CategoryVo categoryVo = new CategoryVo();
                    BeanUtils.copyProperties(ele, categoryVo);
                    categoryVo.setChildren(getChildren(categoryVo, entityList));
                    return categoryVo;
                })
                .sorted((ele1, ele2) -> (ele1.getSort() == null ? 0 : ele1.getSort()) - (ele2.getSort() == null ? 0 : ele2.getSort()))
                .collect(Collectors.toList());
    }

    @Override
    public void removeMenuByIds(List<CategoryVo> list) {
        // TODO 检查当前删除的菜单，是否被别的地方引用

        // 逻辑删除
        baseMapper.deleteBatchIds(list);
    }

    @Override
    public Long[] findCatelogPath(Long catelogId) {
        List<Long> paths = new ArrayList<>();
        List<Long> parentPath = findParentPath(catelogId, paths);

        Collections.reverse(parentPath);


        return parentPath.toArray(new Long[parentPath.size()]);
    }

    /**
    * @Description: 级联更新所有数据
    * @Author: doki
    * @Param: [categoryEntity]
    * @return: void
    * @Date: 2022/4/18 19:54
    */
    @Transactional
    @Override
    public void updateCascade(CategoryEntity categoryEntity) {
        this.updateById(categoryEntity);

        categoryBrandRelationService.updateCategory(categoryEntity.getCatId(), categoryEntity.getName());
    }


    private List<Long> findParentPath(Long catelogId,List<Long> paths){
        //1、收集当前节点id
        paths.add(catelogId);
        CategoryEntity byId = this.getById(catelogId);
        if(byId.getParentCid()!=0){
            findParentPath(byId.getParentCid(),paths);
        }
        return paths;

    }


    private List<CategoryVo> getChildren(CategoryVo root, List<CategoryEntity> all) {
        return all.stream()
                .filter(ele -> ele.getParentCid().equals(root.getCatId()))
                .map(ele -> {
                    CategoryVo categoryVo = new CategoryVo();
                    BeanUtils.copyProperties(ele, categoryVo);
                    categoryVo.setChildren(getChildren(categoryVo, all));
                    return categoryVo;
                })
                .sorted((ele1, ele2) -> (ele1.getSort() == null ? 0 : ele1.getSort()) - (ele2.getSort() == null ? 0 : ele2.getSort()))
                .collect(Collectors.toList());
    }

}