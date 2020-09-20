package cn.scut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.scut.dao.JavaCollection;
import cn.scut.dao.PersonDao;
import cn.scut.service.PersonService;
import cn.scut.service.PersonServiceImpl;
import org.junit.Test;
public class SpringTest {
//    @Test
//    public void test() {
//    	// ����Spring�����ļ���·��
//        String xmlPath = "beans.xml";
//        // ��ʼ��Spring���������������ļ�
//        @SuppressWarnings("resource")
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
//                xmlPath);
//        // ͨ��������ȡpersonDaoʵ��
//        PersonService person = (PersonService) applicationContext
//                .getBean("personServiceImpl");
//        // ���� personDao �� add ()����
//        person.add();
//	}
    
    @Test
    public void test() {
    	// ����Spring�����ļ���·��
        String xmlPath = "beans2.xml";
        // ��ʼ��Spring���������������ļ�
        @SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                xmlPath);
        // ͨ��������ȡjavaCollectionʵ��
        JavaCollection jCollection = (JavaCollection) applicationContext
                .getBean("javaCollection");
        System.out.println(jCollection);
	}
    
}
