package com.harukaze.shop.ware.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @PackageName: com.harukaze.shop.ware.vo
 * @ClassName: PurchaseDoneVo
 * @Description:
 * @Author: doki
 * @Date: 2022/4/20 23:29
 */

@Data
public class PurchaseDoneVo {
    @NotNull
    private Long id;

    private List<PurchaseItemDoneVo> items;
}
