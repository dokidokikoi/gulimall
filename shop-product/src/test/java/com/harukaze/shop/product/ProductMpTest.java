package com.harukaze.shop.product;

import com.harukaze.shop.product.entity.BrandEntity;
import com.harukaze.shop.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @PackageName: com.harukaze.shop.product
 * @ClassName: ProductMpTest
 * @Description:
 * @Author: doki
 * @Date: 2022/4/10 13:32
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductMpTest {
    @Autowired
    BrandService brandService;

    @Test
    public void testQuery() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        System.out.println(brandService.save(brandEntity));
    }
}
