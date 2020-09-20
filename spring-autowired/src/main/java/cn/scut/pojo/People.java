package cn.scut.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class People {
	@Autowired //自动装配该属性
	@Qualifier(value = "name")//指定注入的bean对象
	private Name name;
	@Autowired
	private Address address;
}
