package org.person.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.person.pojo.Payment;
import org.person.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Query;

/**
 * @author rainbowPerfect/RainbowPerfect
 * @version v1.0
 * @create 2021/1/19/23:30
 */

@RestController
@Api("支付程序的入口")
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @ApiOperation("根据商户id获取商户信息")
    @GetMapping("/query")
    public CommonResult query(Long id) {
        Payment payment = paymentService.getPaymentById(id);
        return CommonResult.success(payment.getSerial());
    }

    @ApiOperation("保存商户支付信息")
    @PostMapping("/save")
    public CommonResult save(Payment payment) {
        Boolean aBoolean = paymentService.create(payment);
        if (aBoolean) {
            return CommonResult.success(aBoolean);
        } else {
            return  CommonResult.failed();
        }
    }
}
