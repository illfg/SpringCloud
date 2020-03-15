package main.service.impl;


import entity.Payment;
import main.mapper.paymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import main.service.PaymentService;

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
