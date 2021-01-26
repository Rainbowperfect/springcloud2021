package org.person.service;

import org.person.pojo.Payment;


/**
 * @author rainbowPerfect/RainbowPerfect
 * @version v1.0
 * @create 2021/1/19/23:03
 */

public interface PaymentService {
    /**
     * @param payment
     * @return 创建实体对像
     */
    Boolean create(Payment payment);

    Payment getPaymentById(Long id);
}
