package cn.scut.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class People {
	@Autowired //�Զ�װ�������
	@Qualifier(value = "name")//ָ��ע���bean����
	private Name name;
	@Autowired
	private Address address;
}
