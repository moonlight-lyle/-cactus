package com.changgou;

import com.changgou.goods.dao.BrandMapper;
import com.changgou.goods.pojo.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * 商品测试类
 *
 * @author Lyle
 * @date 2020/12/25
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GoodsTest {

    @Autowired(required = false)
    private BrandMapper brandMapper;

    @Test
    public void fun01(){
        List<Brand> brands = brandMapper.selectAll();
        if (!CollectionUtils.isEmpty(brands)){
            for (Brand brand : brands) {
                System.out.println(brand.getName());
            }
        }
    }
}
