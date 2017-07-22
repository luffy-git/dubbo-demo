package om.jaood.consumer.controller;

import com.jaood.provider.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 消费接口
 * @Fiel om.jaood.consumer.controller.DemoController
 * @Author jaood
 * @Date 2017/7/22 16:29
 */
@RestController
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @RequestMapping("/hello")
    public String home(){
        return demoService.sayHay();
    }
}
