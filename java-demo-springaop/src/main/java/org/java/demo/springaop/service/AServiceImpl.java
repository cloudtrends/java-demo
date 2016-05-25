package org.java.demo.springaop.service;

import org.java.demo.springaop.annotation.Tracer;

/**
 * 接口A的实现类
 */
public class AServiceImpl implements AService {

    @Override
    @Tracer
    public void fooA(String msg) {
        System.out.println("AServiceImpl.fooA(msg:" + msg + ")");
    }

    @Override
    public void barA() {
        System.out.println("AServiceImpl.barA()");

    }
}
