package com.linfeng.bean.study;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.linfeng.bean.Employee;


public class Employee2Bean {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Map<String,Object> map = new HashMap<>();
		map.put("id", "1");
		map.put("name", "linfeng");
		map.put("sex","male");
		map.put("age", "32");
		try {
			System.out.println(map);
			BeanUtils.setProperty(employee, "age", "23");
			BeanUtils.populate(employee,map);
			System.out.println(employee);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
