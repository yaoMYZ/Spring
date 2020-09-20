package cn.scut.service;

import cn.scut.dao.PersonDao;
import lombok.Data;

@Data
public class PersonServiceImpl implements PersonService {
	private PersonDao personDao;
	private String name;
	
	public void add() {
		// TODO Auto-generated method stub
		personDao.add();
		System.out.println(name);
	}

	
	public PersonServiceImpl(String name) {
		super();
		this.name = name;
	}


	public PersonServiceImpl(PersonDao personDao, String name) {
		super();
		this.personDao = personDao;
		this.name = name;
	}

}
