package cn.vonfly.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Administrator on 2017/7/4.
 *
 * servlet3.0中  servlet容器 会在classes（类路径中）下查找实现了javax.servlet.ServletContainerInitializer接口的类，找到则用来配置servlet容器
 * spring 提供了该接口的实现 SpringServletContainerInitializer
 * SpringServletContainerInitializer 又会去找实现了WepApplicationInitializer的类并将配置任务交给这个实现类‘
 * spring 引入便利的抽象类，即AbstractAnnotationConfigDispatcherServletInitializer ，所以此处我们仅需要继承该类即可
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    /**
     *
     * @return
     */
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
