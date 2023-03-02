package com.Richerlv.springcloud.controller;

import com.Richerlv.springcloud.entities.CommonResult;
import com.Richerlv.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Richerlv
 * @date: 2023/3/2 23:38
 * @description:
 */

@RestController
@Slf4j
public class OrderController {

    private final static String PAYMENT_URL = "http://127.0.0.1:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/create")
    public CommonResult create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create/", payment, CommonResult.class);
    }

    @GetMapping("consumer/payment/get/{id}")
    public CommonResult<Payment> create(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }


}
