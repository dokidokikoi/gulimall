package com.harukaze.shop.product.vo;

import com.harukaze.shop.product.entity.AttrGroupEntity;
import lombok.Data;

/**
 * @PackageName: com.harukaze.shop.product.entity.vo
 * @ClassName: AttrGroupVo
 * @Description:
 * @Author: doki
 * @Date: 2022/4/18 18:03
 */

@Data
public class AttrGroupVo extends AttrGroupEntity {
    private Long[] catelogPath;
}
