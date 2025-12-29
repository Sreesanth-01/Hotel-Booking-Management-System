package com.examly.springapp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Before any controller method
    @Before("execution(* com.examly.springapp.controller..*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("➡️ Entering method: " + joinPoint.getSignature());
    }

    // After successful execution
    @AfterReturning("execution(* com.examly.springapp.controller..*(..))")
    public void logAfterSuccess(JoinPoint joinPoint) {
        System.out.println("✅ Successfully executed: " + joinPoint.getSignature());
    }

    // After exception
    @AfterThrowing(
        value = "execution(* com.examly.springapp.controller..*(..))",
        throwing = "ex"
    )
    public void logAfterException(JoinPoint joinPoint, Exception ex) {
        System.out.println("❌ Exception in: " + joinPoint.getSignature());
        System.out.println("Reason: " + ex.getMessage());
    }
}
