package com.java.eureka.client.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/cart")
public class CartRestController {

    private static final Logger log = LoggerFactory.getLogger(CartRestController.class);

    @GetMapping("/getData")
    public String getCartProducts() {
        log.info("Inside getData of CartRestController");
        return "Returning products from CART-SERVICE";
    }
}