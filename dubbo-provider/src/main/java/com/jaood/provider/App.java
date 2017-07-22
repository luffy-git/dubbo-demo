package com.jaood.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description 服务接口启动
 * @Fiel com.jaood.provider.service.App
 * @Author jaood
 * @Date 2017/7/22 16:30
 */
@SpringBootApplication
@ImportResource("classpath:spring-boot-provider.xml")
public class App extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }

    /**
     * @Description 设置启动端口
     * @Author jaood
     * @Date 2017/7/22 16:40
     * @Param [container]
     * @Return void
     */
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8081);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
