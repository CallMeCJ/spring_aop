package com.cjzheng.aop.service;

/**
 * Created by ZhengChaoJie on 2017/8/14/0014.
 */
public interface ICustomerService {

    void addCustomer();
    void addCustomerThrowException() throws Exception;
    void addCustomerAround(String name);
    String addCustomerReturnValue();
}
