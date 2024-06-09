package com.eay.training.spring.cloud.customer.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {


    @GetMapping("/order/get")
    public String getCustomer(){

      return  "Hello World order service : "+Thread.currentThread().getName();
    }
}
