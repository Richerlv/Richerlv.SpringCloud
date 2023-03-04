package com.Richerlv.springcloud.service.impl;

import com.Richerlv.springcloud.dao.PaymentDao;
import com.Richerlv.springcloud.entities.Payment;
import com.Richerlv.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Richerlv
 * @date: 2023/3/2 16:18
 * @description:
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
