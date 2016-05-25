package org.java.demo.springaop;

import org.java.demo.springaop.service.BServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Benchmark {
    
    private BServiceImpl bService;
    private int total = 1000;
    
    @Before
    public void setUp() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        bService = (BServiceImpl)context.getBean("bService");
    }
    
    @Test
    public void benchmark1() throws Exception {
        long start = System.currentTimeMillis();
        for (int i=0; i<total; i++) {
            bService.fooB(); 
        }
        long end = System.currentTimeMillis();
        System.out.println("without aop, avg cost: " + (end-start)/total);
    }
    
    @Test
    public void benchmark2() throws Exception {
        long start = System.currentTimeMillis();
        for (int i=0; i<total; i++) {
            bService.fooBWithAnnotation();  
        }
        long end = System.currentTimeMillis();
        System.out.println("with aop, avg cost: " + (end-start)/total);
    }
   
}
