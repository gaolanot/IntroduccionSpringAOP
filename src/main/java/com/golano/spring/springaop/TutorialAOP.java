/*
 * Clase de creación del contenedor
 * http://acodigo.blogspot.com/2017/07/tutorial-spring-aop.html
 */
package com.golano.spring.springaop;

import com.golano.spring.component.CrudService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 24/04/2019
 * @author gaolanot
 */
@Configuration
@ComponentScan({"com.golano.spring.aspect","com.golano.spring.component"})
@EnableAspectJAutoProxy
public class TutorialAOP {

    public static void main(String[] args) {
        ApplicationContext ctx = 
                new AnnotationConfigApplicationContext(TutorialAOP.class) ;
        CrudService ps = ctx.getBean(CrudService.class);
        
        ps.create();
        ps.read();
        ps.update();
        ps.delete();
    }
    
}
