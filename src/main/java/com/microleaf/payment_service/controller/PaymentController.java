package com.microleaf.payment_service.controller;

import com.microleaf.payment_service.entity.PaymentOption;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @GetMapping
    public List<PaymentOption> getAllPaymentOptions() {
        return List.of(PaymentOption.builder().name("DEBIT CARD").id(1).build(),
                        PaymentOption.builder().name("CREDIT CARD").id(2).build(),
                        PaymentOption.builder().name("UPI").id(3).build());
    }
}
