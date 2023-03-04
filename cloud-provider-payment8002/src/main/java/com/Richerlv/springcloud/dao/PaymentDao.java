package com.Richerlv.springcloud.dao;

import com.Richerlv.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Richerlv
 * @date: 2023/3/2 16:01
 * @description:
 */

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
