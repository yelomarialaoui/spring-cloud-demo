package com.eay.training.spring.cloud.customer.ms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RefreshScope
@RestController
public class PropertyController {

    @Value("${checkout.enabled}")
  private String param1;
    @Value("${order.prefix}")
    private String param2;

    @Value("${server.port}")
    private int port;

    @Value("${commun.param}")
    private String otherFileParam;

    @GetMapping("/myConfig")
    public Map<String,Object> getParams(){

        Map<String,Object> maps = new HashMap<>();
        maps.put("checkout.enabled",param1);
        maps.put("order.prefix",param2);
        maps.put("port",port);
        maps.put("otherFileParam",otherFileParam);

        maps.put("threadName",Thread.currentThread().getName());
        return maps;
    }

}
