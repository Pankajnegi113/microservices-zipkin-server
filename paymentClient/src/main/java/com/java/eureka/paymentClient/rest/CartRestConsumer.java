package com.java.eureka.paymentClient.rest;

import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
@Configuration
public class CartRestConsumer {

    private Logger log = LoggerFactory.getLogger(CartRestConsumer.class);

    @Autowired
    RestTemplate restTemplate;


    @Bean
    public Sampler alwaysSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }


    public String getCartProductsDetails() {
        log.info("Hitting getData of cart from payment service");
        String url = "http://localhost:8090/cart/getData";
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }

}
