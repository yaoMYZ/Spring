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
//    	// 定义Spring配置文件的路径
//        String xmlPath = "beans.xml";
//        // 初始化Spring容器，加载配置文件
//        @SuppressWarnings("resource")
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
//                xmlPath);
//        // 通过容器获取personDao实例
//        PersonService person = (PersonService) applicationContext
//                .getBean("personServiceImpl");
//        // 调用 personDao 的 add ()方法
//        person.add();
//	}
    
    @Test
    public void test() {
    	// 定义Spring配置文件的路径
        String xmlPath = "beans2.xml";
        // 初始化Spring容器，加载配置文件
        @SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                xmlPath);
        // 通过容器获取javaCollection实例
        JavaCollection jCollection = (JavaCollection) applicationContext
                .getBean("javaCollection");
        System.out.println(jCollection);
	}
    
}
