package com.harukaze.shop.product.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.harukaze.shop.product.entity.CategoryEntity;
import lombok.Data;

import java.util.List;

/**
 * @PackageName: com.harukaze.shop.product.entity.vo
 * @ClassName: CategoryVo
 * @Description:
 * @Author: doki
 * @Date: 2022/4/12 13:05
 */
@Data
public class CategoryVo extends CategoryEntity {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<CategoryVo> children;
}
