package com.xebia.website;


import com.xebia.website.config.AppConfig;
import com.xebia.website.service.CalculateCustomerDiscount;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        CalculateCustomerDiscount discount=context.getBean("calculateCustomerDiscount", CalculateCustomerDiscount.class);
        discount.setTotalBillAmount(1000);
        discount.setUserType("affiliate");
        discount.calculate();



    }

}
