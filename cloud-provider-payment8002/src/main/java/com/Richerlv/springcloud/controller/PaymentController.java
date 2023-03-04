package com.Richerlv.springcloud.controller;

import com.Richerlv.springcloud.entities.CommonResult;
import com.Richerlv.springcloud.entities.Payment;
import com.Richerlv.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Richerlv
 * @date: 2023/3/2 16:19
 * @description:
 */

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
//        log.info("插入结果:{}", result);
        if(result > 0) {
            return new CommonResult<Integer>(200, "插入数据库成功:" + serverPort, result);
        } else {
            return new CommonResult<Integer>(444, "插入数据库失败");
        }
    }


    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
//        log.info("查询结果:{}", result);
        if(result != null) {
            return new CommonResult<Payment>(200, "查询成功:" + serverPort, result);
        } else {
            return new CommonResult<Payment>(444, "没有相应记录, id = " + id, result);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for(String service : services) {
            log.info("******element: " + service);
        }
        List<ServiceInstance> instances = (List<ServiceInstance>) discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }
}
