package com.cjzheng.aop.main;

import com.cjzheng.aop.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-customer.xml");
        ICustomerService customerService = (ICustomerService) appContext.getBean("customerService");
        customerService.addCustomer();
        customerService.addCustomerReturnValue();
        customerService.addCustomerThrowException();
        customerService.addCustomerAround("CJ");
    }
}