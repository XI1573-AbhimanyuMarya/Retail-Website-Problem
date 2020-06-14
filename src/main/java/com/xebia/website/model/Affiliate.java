package com.xebia.website.model;

import org.springframework.stereotype.Component;

@Component
public class Affiliate {
    private int discount=10;

    public int getDiscount() {
        return discount;
    }
}
