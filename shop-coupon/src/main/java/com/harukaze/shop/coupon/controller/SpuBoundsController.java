package com.harukaze.shop.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import com.harukaze.common.to.SpuBoundTo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.harukaze.shop.coupon.entity.SpuBoundsEntity;
import com.harukaze.shop.coupon.service.SpuBoundsService;
import com.harukaze.common.utils.PageUtils;
import com.harukaze.common.utils.R;



/**
 * 商品spu积分设置
 *
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 14:05:03
 */
@RestController
@RequestMapping("coupon/spubounds")
public class SpuBoundsController {
    @Autowired
    private SpuBoundsService spuBoundsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("coupon:spubounds:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = spuBoundsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
//    @RequiresPermissions("coupon:spubounds:info")
    public R info(@PathVariable("id") Long id){
		SpuBoundsEntity spuBounds = spuBoundsService.getById(id);

        return R.ok().put("spuBounds", spuBounds);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
//    @RequiresPermissions("coupon:spubounds:save")
    public R save(@RequestBody SpuBoundTo spuBoundTo){
        SpuBoundsEntity spuBoundsEntity = new SpuBoundsEntity();
        BeanUtils.copyProperties(spuBoundTo, spuBoundsEntity);
		spuBoundsService.save(spuBoundsEntity);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
//    @RequiresPermissions("coupon:spubounds:update")
    public R update(@RequestBody SpuBoundsEntity spuBounds){
		spuBoundsService.updateById(spuBounds);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
//    @RequiresPermissions("coupon:spubounds:delete")
    public R delete(@RequestBody Long[] ids){
		spuBoundsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
