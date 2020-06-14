package com.xebia.website.service;

import com.xebia.website.model.Affiliate;
import com.xebia.website.model.Customer;
import com.xebia.website.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("calculateCustomerDiscount")
public class CalculateCustomerDiscount {
    @Autowired
    Employee employee;
    @Autowired
    DiscountCalculation calculation;
    @Autowired
    Affiliate affiliate;
    @Autowired
    Customer customer;

    private String userType;
    private double totalBillAmount;
    private double amountVariable;
    private int passDiscount;

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setTotalBillAmount(double totalBillAmount) {
        this.totalBillAmount = totalBillAmount;
    }


    public void calculate() {
        if (userType.equalsIgnoreCase("employee")) {
            passDiscount = employee.getDiscount();
            calculation.doMaths(totalBillAmount, passDiscount);
        } else if (userType.equalsIgnoreCase("affiliate")) {
            passDiscount = affiliate.getDiscount();
            calculation.doMaths(totalBillAmount, passDiscount);
        } else if (userType.equalsIgnoreCase("customer")) {
            customer.setTermOfTheCustomer(3);
            passDiscount = customer.customerDiscount();
            calculation.doMaths(totalBillAmount, passDiscount);
        } else {
            System.out.println("UnAuthorized User Type");
        }

    }

}
