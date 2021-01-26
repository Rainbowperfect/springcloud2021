package org.person.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.person.pojo.Payment;

/**
 * @author rainbowPerfect/RainbowPerfect
 * @version v1.0
 * @create 2021/1/19/23:13
 */
@Mapper
public interface PaymentMapper {

    Boolean create(Payment payment);

    Payment getPaymentById(@Param("id")Long id);
}
