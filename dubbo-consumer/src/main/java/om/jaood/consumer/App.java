package om.jaood.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description 消费接口启动
 * @Fiel om.jaood.consumer.App
 * @Author jaood
 * @Date 2017/7/22 16:28
 */
@SpringBootApplication
@ImportResource("classpath:spring-boot-consumer.xml")
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
        container.setPort(8082);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
