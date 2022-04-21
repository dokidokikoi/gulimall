package com.harukaze.shop.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.harukaze.shop.product.entity.AttrEntity;
import com.harukaze.shop.product.service.AttrAttrgroupRelationService;
import com.harukaze.shop.product.service.AttrService;
import com.harukaze.shop.product.vo.AttrGroupRelationVo;
import com.harukaze.shop.product.vo.AttrGroupVo;
import com.harukaze.shop.product.service.CategoryService;
import com.harukaze.shop.product.vo.AttrGroupWithAttrsVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.harukaze.shop.product.entity.AttrGroupEntity;
import com.harukaze.shop.product.service.AttrGroupService;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.common.utils.R;


/**
 * 属性分组
 *
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 13:09:02
 */
@RestController
@RequestMapping("product/attrgroup")
public class AttrGroupController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private AttrGroupService attrGroupService;

    @Autowired
    private AttrService attrService;

    @Autowired
    private AttrAttrgroupRelationService attrAttrgroupRelationService;

    @GetMapping("/{catelogId}/withattr")
    public R getAttrGroup(@PathVariable("catelogId") Long catelogId) {
        List<AttrGroupWithAttrsVo> vos = attrGroupService.getAttrGroupWithAttrsByCatelogId(catelogId);

        return R.ok().put("data", vos);
    }

    @RequestMapping("/{attrgroupId}/attr/relation")
    public R attrRelation(@PathVariable("attrgroupId") Long attrgroupId) {
        List<AttrEntity> attrGroupEntities = attrService.getRelationAttr(attrgroupId);
        return R.ok().put("data", attrGroupEntities);
    }

    @PostMapping("attr/relation")
    public R addRelation(@RequestBody List<AttrGroupRelationVo> vos) {
        attrAttrgroupRelationService.saveBatch(vos);
        return R.ok();
    }

    @RequestMapping("/{attrgroupId}/noattr/relation")
    public R attrNoRelation(@PathVariable("attrgroupId") Long attrgroupId,
                            @RequestParam Map<String, Object> params) {
        PageUtils page = attrService.getNoRelationAttr(params, attrgroupId);
        return R.ok().put("page", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/list/{catelogId}")
    public R list(@RequestParam Map<String, Object> params,
                  @PathVariable("catelogId") Long catelogId){
//        PageUtils page = attrGroupService.queryPage(params);

        PageUtils page = attrGroupService.queryPage(params, catelogId);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrGroupId}")
    public R info(@PathVariable("attrGroupId") Long attrGroupId){
		AttrGroupEntity attrGroup = attrGroupService.getById(attrGroupId);
        AttrGroupVo attrGroupVo = new AttrGroupVo();
        BeanUtils.copyProperties(attrGroup, attrGroupVo);

        attrGroupVo.setCatelogPath(categoryService.findCatelogPath(attrGroupVo.getCatelogId()));
        return R.ok().put("attrGroup", attrGroupVo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AttrGroupEntity attrGroup){
		attrGroupService.save(attrGroup);

        return R.ok();
    }

    @RequestMapping("/attr/relation/delete")
    public R deleteRelation(@RequestBody AttrGroupRelationVo[] attrGroupRelationVos) {
        attrService.deleteRelation(attrGroupRelationVos);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AttrGroupEntity attrGroup){
		attrGroupService.updateById(attrGroup);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] attrGroupIds){
		attrGroupService.removeByIds(Arrays.asList(attrGroupIds));

        return R.ok();
    }

}
