package com.cjzheng.aop.service.impl;

import com.cjzheng.aop.service.ICustomerService;

/**
 * Created by ZhengChaoJie on 2017/8/14/0014.
 */
public class CustomerService implements ICustomerService {
    public void addCustomer() {
        System.out.println("addCustomer() is running ");
    }

    public String addCustomerReturnValue() {
        System.out.println("addCustomerReturnValue() is running ");
        return "abc";
    }

    public void addCustomerThrowException() throws Exception {
        System.out.println("addCustomerThrowException() is running ");
    }

    public void addCustomerAround(String name) {
        System.out.println("addCustomerAround() is running, args : " + name);
    }
}
