package cn.vonfly.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Administrator on 2017/7/4.
 */
@Configuration
@ComponentScan(basePackages = "cn.vonfly",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class),
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)
})
@Import({BeansConfig.class})
public class RootConfig {
}
