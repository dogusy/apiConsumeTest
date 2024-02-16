package com.example.demo.aspects;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ErrorLoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(ErrorLoggingAspect.class);

    @Pointcut("execution(* com.example.demo.service..*.*(..))")
    public void serviceMethods() {
    }

    @AfterThrowing(pointcut = "serviceMethods()", throwing = "ex")
    public void logAfterThrowing(Exception ex) {
        logger.error("Exception in service method:", ex);
    }
}
