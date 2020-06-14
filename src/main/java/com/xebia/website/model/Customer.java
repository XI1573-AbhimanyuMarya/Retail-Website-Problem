package com.xebia.website.model;

import com.xebia.website.conditionalstatements.CustomerStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    @Autowired
    CustomerStatement customerDiscountStatement;
    private int discount;
    private int termOfTheCustomer;

    public void setTermOfTheCustomer(int termOfTheCustomer) {
        this.termOfTheCustomer = termOfTheCustomer;
    }

    public int customerDiscount()
    {
        return customerDiscountStatement.discountOnTerm(termOfTheCustomer);
    }
}
