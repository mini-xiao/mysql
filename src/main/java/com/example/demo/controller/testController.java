package com.example.demo.controller;

import com.example.demo.mapper.TradeSysAgentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述:
 *
 * @Params:
 * @Author: LiuMZ
 * @Date: 2020/10/27 16:10
 */
@RestController
@RequestMapping("/agent")
public class testController {

    @Autowired
    private TradeSysAgentMapper tradeSysAgentMapper;

    @RequestMapping("/test")
    public String test(){
        List<String> src=tradeSysAgentMapper.selectQueryList();
        return src.toString();
    }
}
