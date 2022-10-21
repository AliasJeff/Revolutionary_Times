package com.zhexun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*Spring的配置文件，加载controller对应的bean*/
@Configuration
@ComponentScan({"com.zhexun.controller", "com.zhexun.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
