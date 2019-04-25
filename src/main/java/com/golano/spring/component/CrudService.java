/*
 * Clase de ejemplo para el tutorial de Spring AOP
 * http://acodigo.blogspot.com/2017/07/tutorial-spring-aop.html
 */
package com.golano.spring.component;

import org.springframework.stereotype.Component;

/**
 * 24/04/2019
 * @author gaolanot
 */
@Component
public class CrudService {
    public void create() {
        System.out.println("crear dato...");
    }

    public void read() {
        System.out.println("leer dato...");
    }

    public void update() {
        try {
            Thread.sleep(377);
            System.out.println("actualizar dato...");
        } catch (InterruptedException ex) {

        }
    }

    public void delete() {
        System.out.println("eliminar dato...");
    }
}
