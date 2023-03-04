package com.Richerlv.springcloud.service;

import com.Richerlv.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Richerlv
 * @date: 2023/3/2 16:17
 * @description:
 */

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
