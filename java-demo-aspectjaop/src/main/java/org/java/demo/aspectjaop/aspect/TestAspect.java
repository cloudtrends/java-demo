package org.java.demo.aspectjaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {

    @Around(value = "@annotation(org.java.demo.aspectjaop.annotation.Tracer)")
	public Object watchPerformance(ProceedingJoinPoint pjp) {
		System.out.println("before proceed...");
		try {
			Object result = pjp.proceed();
			System.out.println("after proceed...");
			return result;
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}
	}
}
