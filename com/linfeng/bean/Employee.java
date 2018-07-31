package com.linfeng.bean;

@SuppressWarnings("unused")
public class Employee {
	private String id;
	private String name;
	private String sex;
	private String age;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
