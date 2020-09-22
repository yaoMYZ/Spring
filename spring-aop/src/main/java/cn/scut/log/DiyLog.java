package cn.scut.log;

public class DiyLog {
	public void after() {
		System.out.println("======执行前======");
	}
	
	public void before() {
		System.out.println("======执行后======");
	}
}
