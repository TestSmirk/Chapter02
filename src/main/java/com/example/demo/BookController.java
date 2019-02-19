package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @GetMapping("/test1")
    public void test1(){
        ValueOperations ops = redisTemplate.opsForValue();
        Book book = new Book();
        book.setName("水浒传");
        book.setAuthor("施耐庵");
        ops.set("b1",book);
        System.out.println(ops.get("b1"));
        ValueOperations<String, String> ops2 = stringRedisTemplate.opsForValue();
        ops2.set("k1","v1");
        System.out.println(ops2.get("k1"));
    }
    @GetMapping("/result")
    public void test2(){
        Integer[] ints = new Integer[]{1, 2, 3, 4, 5};

        List<Integer> ints1 =  Arrays.asList(ints);
        ints1.add(3);
        System.out.println(ints1);


    }

}
