package org.java.demo.springaop.main;

import org.java.demo.springaop.service.AService;
import org.java.demo.springaop.service.AServiceImpl;
import org.java.demo.springaop.service.BServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
    @SuppressWarnings("resource")
    public static void main( String[] args ) throws Exception
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        AService aService = (AService)context.getBean("aService");
        BServiceImpl bService = (BServiceImpl)context.getBean("bService");
        
//        aService.fooA("JUnit test fooA");  
//        aService.barA();  
//        bService.fooB();  
//        bService.barB("JUnit test barB",0);
        
        AService a = new AServiceImpl();
        a.fooA("test");
        
        System.out.println( "Hello World!" );
    }
}


