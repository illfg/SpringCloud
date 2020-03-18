package org.yuanqi.providerpayment8003.main.service;


import entity.Payment;

public interface PaymentService {
    public int create(Payment payment);


    public Payment getPaymentById(Long id);

}
