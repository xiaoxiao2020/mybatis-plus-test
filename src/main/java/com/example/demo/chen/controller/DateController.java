package com.example.demo.chen.controller;

import com.example.demo.chen.entity.DateVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author chendesheng chendesheng@tuhu.cn
 * @desc
 * @create 2019/8/1 21:27
 */
@RestController
@RequestMapping("/date/")
public class DateController {

    @RequestMapping("getDate")
    public DateVo getDate(@RequestBody DateVo vo){
        System.out.println("date1:"+vo.getDate());

        DateVo vo2 = new DateVo();
        vo2.setDate(LocalDateTime.now());
        return vo2;
    }


    @GetMapping("query")
    public DateVo query() {
        DateVo order = new DateVo();
        order.setDate(LocalDateTime.now());
        return order;
    }
}