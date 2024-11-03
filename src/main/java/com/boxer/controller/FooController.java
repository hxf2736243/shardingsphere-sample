package com.boxer.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.boxer.dto.HelloDTO;
import com.boxer.mapper.OrderInfoMapper;
import com.boxer.po.OrderInfo;
import com.boxer.service.ServiceB;
import com.boxer.service.ServiceBB;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/app")
public class FooController {
    @Resource
    private ServiceB serviceB;

    @Resource
    private ServiceBB serviceBB;

    @Resource
    OrderInfoMapper orderInfoMapper;


    @GetMapping ("/c")
    public String sayC(){
        return "c";
    }

    @GetMapping ("/b")
    public ResponseEntity<String> sayB(){
        serviceB.b();
        return ResponseEntity.ok().build();
    }

    @GetMapping ("/bb")
    public ResponseEntity<String> sayBB(){
        serviceBB.b();
        return ResponseEntity.ok().build();
    }

    @PostMapping ("/add")
    public ResponseEntity<String> add(@Valid  @RequestBody  HelloDTO dto){
        System.out.println(dto.getEventDate());
        System.out.println("startDate:"+dto.getStartDate());
        serviceBB.b();
        return ResponseEntity.ok().build();
    }


    @GetMapping ("/list")
    public ResponseEntity<String> list(){
        QueryWrapper<OrderInfo> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id","1");
        queryWrapper.eq("buyer_id","2");
        orderInfoMapper.selectList(queryWrapper);
        return ResponseEntity.ok().build();
    }

}
