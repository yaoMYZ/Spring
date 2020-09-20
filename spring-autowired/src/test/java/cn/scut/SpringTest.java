package cn.scut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.scut.pojo.People;

import org.junit.Test;
public class SpringTest {

    
    @Test
    public void test() {
    	// 定义Spring配置文件的路径
        String xmlPath = "beans.xml";
        // 初始化Spring容器，加载配置文件
        @SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                xmlPath);
        // 通过容器获取People实例
        People people = (People) applicationContext
                .getBean("people");
        System.out.println(people);
	}
    
}
