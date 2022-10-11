package com.java.eureka.paymentClient.controller;

import com.java.eureka.paymentClient.rest.CartRestConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentRestController {

    @Autowired
    private CartRestConsumer consumer;

    private static final Logger log = LoggerFactory.getLogger(PaymentRestController.class);

    @GetMapping("/data")
    public String getPaymentData() {

        log.info("Inside getPaymentData() of PaymentRestController");
        return "From Payment Service: " + consumer.getCartProductsDetails();
    }
}
