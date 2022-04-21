package com.harukaze.shop.product.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.harukaze.shop.product.entity.AttrEntity;
import lombok.Data;

import java.util.List;

/**
 * @PackageName: com.harukaze.shop.product.vo
 * @ClassName: AttrAttrGroupRelationVo
 * @Description:
 * @Author: doki
 * @Date: 2022/4/19 22:06
 */

@Data
public class AttrGroupWithAttrsVo {
    /**
     * 分组id
     */
    @TableId
    private Long attrGroupId;
    /**
     * 组名
     */
    private String attrGroupName;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    private String descript;
    /**
     * 组图标
     */
    private String icon;
    /**
     * 所属分类id
     */
    private Long catelogId;

    private List<AttrEntity> attrs;
}
