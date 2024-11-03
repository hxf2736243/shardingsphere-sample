package com.boxer;


import com.boxer.mapper.OrderInfoMapper;
import com.boxer.po.OrderInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest {
    @Resource
    private OrderInfoMapper orderMapper;


    @Test
    public void addOrder(){
        for (int i = 0; i < 10; i++) {
            OrderInfo order=new OrderInfo();
            order.setId(Long.parseLong(""+i));
            order.setBuyerId(Long.parseLong(""+1000+1));
            order.setTotalAmt(new BigDecimal("11.1"));
            order.setOrderDate(LocalDateTime.now());
            orderMapper.insert(order);

        }
    }
}
