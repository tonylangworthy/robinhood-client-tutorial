package com.autotrader.web.client.robinhood.authorization;

import org.springframework.web.client.RestTemplate;

public class RetrieveToken {

    private RestTemplate restTemplate;

    public RetrieveToken(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void invoke() {
        System.out.println("\n\n\nIs restTemplate null? " + (restTemplate == null));
    }
}
