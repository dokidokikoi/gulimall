package com.harukaze.shop.ware.vo;

import lombok.Data;

/**
 * @PackageName: com.harukaze.shop.ware.vo
 * @ClassName: PurchaseItemDoneVo
 * @Description:
 * @Author: doki
 * @Date: 2022/4/20 23:30
 */

@Data
public class PurchaseItemDoneVo {
    private Long itemId;
    private Integer status;
    private String reason;
}
