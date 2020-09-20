package cn.scut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.scut.pojo.People;

import org.junit.Test;
public class SpringTest {

    
    @Test
    public void test() {
    	// ����Spring�����ļ���·��
        String xmlPath = "beans.xml";
        // ��ʼ��Spring���������������ļ�
        @SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                xmlPath);
        // ͨ��������ȡPeopleʵ��
        People people = (People) applicationContext
                .getBean("people");
        System.out.println(people);
	}
    
}
