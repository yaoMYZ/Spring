package cn.scut.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
	@org.junit.Test
	public void Test() {
		// ����Spring�����ļ���·��
	    String xmlPath = "beans.xml";
	    // ��ʼ��Spring���������������ļ�
	    @SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
	            xmlPath);
	    // ͨ��������ȡPeopleʵ��
	    UserService userService = (UserService) applicationContext.getBean("userService");
	    userService.add();
	}
}
