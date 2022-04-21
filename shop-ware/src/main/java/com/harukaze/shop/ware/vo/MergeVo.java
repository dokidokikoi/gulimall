package com.harukaze.shop.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @PackageName: com.harukaze.shop.ware.vo
 * @ClassName: MergeVo
 * @Description:
 * @Author: doki
 * @Date: 2022/4/20 22:32
 */

@Data
public class MergeVo {

    private Long purchaseId;
    private List<Long> items;
}
