package com.xebia.website.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int discount=30;

    public int getDiscount() {
        return discount;
    }
}
