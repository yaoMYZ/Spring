package edu.scut.pojo;

import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("Teacher")
public class Teacher {
	private int id;
	private String name;
	private List<Student> students;
	
	public Teacher() {
		super();
	}
	public Teacher(int id, String name, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", students=" + students + "]";
	}
	
	
}
