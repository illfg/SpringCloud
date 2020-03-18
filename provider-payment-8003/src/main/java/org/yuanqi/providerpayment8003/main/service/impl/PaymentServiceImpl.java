package org.yuanqi.providerpayment8003.main.service.impl;


import entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import org.yuanqi.providerpayment8003.main.mapper.paymentMapper;
import org.yuanqi.providerpayment8003.main.service.PaymentService;

@Service("PaymentService")
public class PaymentServiceImpl implements PaymentService {

    @Qualifier("paymentMapper")
    @Autowired
    paymentMapper mapper;

    @Override
    public int create(Payment payment) {
        mapper.create(payment);
        return 0;
    }

    @Override
    public Payment getPaymentById(Long id) {
        return mapper.getPaymentById(id);
    }
}
