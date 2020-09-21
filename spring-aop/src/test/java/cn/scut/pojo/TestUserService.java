package cn.scut.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
	@org.junit.Test
	public void Test() {
		// 定义Spring配置文件的路径
	    String xmlPath = "beans.xml";
	    // 初始化Spring容器，加载配置文件
	    @SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
	            xmlPath);
	    // 通过容器获取People实例
	    UserService userService = (UserService) applicationContext.getBean("userService");
	    userService.add();
	}
}
