package com.cjzheng.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LoggingAspect {
    @Before("execution(* com.cjzheng.aop.service.ICustomerService.addCustomer(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("******完美的分割线*******");
        System.out.println("logBefore() is running!");
        System.out.println("Hi CJ : " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.cjzheng.aop.service.ICustomerService.addCustomer(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("******完美的分割线*******");
        System.out.println("logAfter() is running!");
        System.out.println("Hi CJ : " + joinPoint.getSignature().getName());
    }

    @AfterReturning(
            pointcut = "execution(* com.cjzheng.aop.service.ICustomerService.addCustomerReturnValue(..))",
            returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("******完美的分割线*******");
        System.out.println("logAfterReturning() is running!");
        System.out.println("Hi CJ : " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + result);
    }

    @AfterThrowing(
            pointcut = "execution(* com.cjzheng.aop.service.ICustomerService.addCustomerThrowException(..))",
            throwing = "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("******完美的分割线*******");
        System.out.println("logAfterThrowing() is running!");
        System.out.println("Hi CJ : " + joinPoint.getSignature().getName());
        System.out.println("Exception : " + error);

    }


    @Around("execution(* com.cjzheng.aop.service.ICustomerService.addCustomerAround(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("logAround() is running!");
        System.out.println("Hi CJ method : " + joinPoint.getSignature().getName());
        System.out.println("Hi CJ arguments : " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("Around before is running!");
        joinPoint.proceed();
        System.out.println("Around after is running!");
        System.out.println("******完美的分割线*******");
    }
}
