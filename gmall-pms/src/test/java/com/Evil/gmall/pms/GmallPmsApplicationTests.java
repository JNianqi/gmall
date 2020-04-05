package com.Evil.gmall.pms;

import com.Evil.gmall.pms.entity.Product;
import com.Evil.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Test
    void test(){
        System.out.println("=========================================");
    }
    @Test
    void contextLoads() {
        Product byId = productService.getById(1);
        System.out.println(byId.getName());
    }

}
