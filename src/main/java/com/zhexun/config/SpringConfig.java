package com.zhexun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/*Spring的配置文件，加载controller对应的bean*/
@Configuration
//@ComponentScan({"com.zhexun.mapper", "com.zhexun.service"})
@ComponentScan(value = "com.zhexun",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Controller.class
        )
)
public class SpringConfig {
}
