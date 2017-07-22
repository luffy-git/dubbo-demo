package com.jaood.provider.service.impl;

import com.jaood.provider.service.IDemoService;
import org.springframework.stereotype.Service;

/**
 * @Description 消费接口实现类
 * @Fiel com.jaood.provider.service.impl.DemoServiceImpl
 * @Author jaood
 * @Date 2017/7/22 16:26
 */
@Service("demoService")
public class DemoServiceImpl implements IDemoService {
    public String sayHay() {
        return "Hllow Dubbo";
    }
}
