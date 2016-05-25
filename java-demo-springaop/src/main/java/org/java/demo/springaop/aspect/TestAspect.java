package org.java.demo.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面
 *
 */
public class TestAspect {

    public void doBefore(JoinPoint jp) {
        System.out.println("doBefore method: " + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName());
    }

    public void doAfter(JoinPoint jp) {
        System.out.println("doAfter method: " + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName());
    }

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long time = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        time = System.currentTimeMillis() - time;
        System.out.println("doAround method: " + pjp.getTarget().getClass().getName() + "."
                + pjp.getSignature().getName() +" process time: " + time);
        return retVal;
    }

    public void doThrowing(JoinPoint jp, Throwable ex) {
        System.out.println("doThrowing method " + jp.getTarget().getClass().getName() + "."
                + jp.getSignature().getName() + " throw exception");
        System.out.println(ex.getMessage());
    }
}
