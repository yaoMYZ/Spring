package cn.scut.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(target.getClass()+":"+method.getName()+" return:"+returnValue);
	}

}
