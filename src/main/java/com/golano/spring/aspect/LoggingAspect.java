/*
 * Clase Aspecto para llevar registro
 * http://acodigo.blogspot.com/2017/07/tutorial-spring-aop.html
 * and open the template in the editor.
 */
package com.golano.spring.aspect;

import java.time.LocalDateTime;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 24/04/2019
 * @author gaolanot
 */
@Aspect
@Component
public class LoggingAspect {
    @Pointcut("execution(* com.golano.spring.component.*.*(..))")
    public void serviceMethod(){}
    
    @Before("serviceMethod()")
    public void beforeLoginAdvice() {
        System.out.println("iniciado " + LocalDateTime.now());
    }

    @After("serviceMethod()")
    public void afterLoginAdvice() {
        System.out.println("finalizado " + LocalDateTime.now());
    }
    
}
