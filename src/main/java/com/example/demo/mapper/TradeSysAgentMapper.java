package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 功能描述:
 *
 * @Params:
 * @Author: LiuMZ
 * @Date: 2020/10/27 16:08
 */
@Mapper
public interface TradeSysAgentMapper {

    List<String> selectQueryList();
}
