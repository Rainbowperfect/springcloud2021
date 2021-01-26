package org.person.service.impl;

import org.person.mapper.PaymentMapper;
import org.person.pojo.Payment;
import org.person.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rainbowPerfect/RainbowPerfect
 * @version v1.0
 * @create 2021/1/19/23:12
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public Boolean create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
