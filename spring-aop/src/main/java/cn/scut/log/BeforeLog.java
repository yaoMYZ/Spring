package cn.scut.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLog implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(target.getClass()+":"+method.getName());
	}

}
