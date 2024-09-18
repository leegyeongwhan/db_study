package db_study.domain;

import db_study.entity.OrderEntity;
import db_study.repository.mybatis.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductTest {

    @Autowired
    OrderMapper orderMapper;

    @Test
    void saveOrder() {
        OrderEntity order = orderMapper.save("order1", "o1");
        System.out.println(order);
    }
}