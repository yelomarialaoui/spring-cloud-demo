package com.eay.training.spring.cloud.customer.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {


    @GetMapping("/customer/get")
    public String getCustomer(){

      return  "Hello World customer service : "+Thread.currentThread().getName();
    }
}
