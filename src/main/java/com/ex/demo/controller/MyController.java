package com.ex.demo.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ex.demo.dao.TbUserMapper;
import com.ex.demo.model.TbUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.MapUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * aa
 *
 * @author yangjianyan
 * @version 1.0.0
 * @date 2018/10/30
 */
@Slf4j
@RestController
public class MyController {

    @ApolloConfig
    private Config config;

    @Autowired
    private TbUserMapper tbUserMapper;

    @Value("${test}")
    private String test;

    @GetMapping("/test1")
    public Map test1(){
        String test = config.getProperty("test", "1");
        Map map = new HashMap(1);
        map.put("test1", test);
        log.info("test1:{}", test);
        return map;
    }

    @GetMapping("test2")
    public Map test2(){
        List<TbUser> tbUsers = tbUserMapper.selectAll();
        log.warn("test2:{}",tbUsers);
        return tbUsers.stream().collect(Collectors.toMap(x->x.getId(),p->p));
    }

    @GetMapping("test3")
    public Map test3(){
        Map map = new HashMap(1);
        map.put("test3", test);
        return map;
    }

}
