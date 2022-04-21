package com.harukaze.shop.product.vo;

import com.harukaze.shop.product.entity.AttrEntity;
import lombok.Data;

/**
 * @PackageName: com.harukaze.shop.product.vo
 * @ClassName: AttrResVo
 * @Description:
 * @Author: doki
 * @Date: 2022/4/18 22:35
 */

@Data
public class AttrRespVo extends AttrEntity {
    private String catelogName;
    private String groupName;
    private Long[] catelogPath;
    private Long attrGroupId;
}
