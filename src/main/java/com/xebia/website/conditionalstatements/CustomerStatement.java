package com.xebia.website.conditionalstatements;

import org.springframework.stereotype.Component;

@Component
public class CustomerStatement {

    public int discountOnTerm(int termOfTheCustomer) {
        if (termOfTheCustomer > 2) {
            return 5;
        } else {
            return 1;
        }
    }

}
