package com.xebia.website.service;

import org.springframework.stereotype.Component;

@Component
public class DiscountCalculation {

    private double amountVariable;
    private double amountVariable1;

    public void doMaths(double totalBillAmount,int discount)
    {
        amountVariable=  (discount*totalBillAmount)/100;
        amountVariable1= (int)(totalBillAmount/100)*5;
        totalBillAmount=totalBillAmount-(amountVariable+amountVariable1);
        System.out.println("Total Payable amount: "+ totalBillAmount);

    }

}
