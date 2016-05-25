package org.java.demo.springaop.service;

import org.java.demo.springaop.annotation.Tracer;

/**
 *   Service类B
 */
public class BServiceImpl {

    public void barB(String _msg, int _type) {
        System.out.println("BServiceImpl.barB(msg:"+_msg+" type:"+_type+")");
        if(_type == 1)
            throw new IllegalArgumentException("测试异常");
    }

    
    public void fooB() throws InterruptedException {
        System.out.println("BServiceImpl.fooB()");
        Thread.sleep(10);
    }
    
    @Tracer
    public void fooBWithAnnotation() throws InterruptedException {
        System.out.println("BServiceImpl.fooB()");
        Thread.sleep(10);
    }
}