package com.mine.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: minechan
 * @Date: 2019/10/19 19:51
 */
@Configuration
@MapperScan("com.example.malldemo.mbg.mapper")
public class MybatisConfig {
}
