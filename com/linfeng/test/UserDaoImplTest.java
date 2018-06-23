package com.linfeng.test;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.linfeng.bean.User;
import com.linfeng.dao.UserDaoImpl;

public class UserDaoImplTest {

	@Before
	public void setUp() throws Exception {
	}
	@Ignore
	@Test
	public void testInsert() {
		User user = new User();
		user.setUsername("lin");
		user.setPassword("lin");
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		int id = userDaoImpl.insert(user);
		System.out.println(id);
	}
	
	@Test
	public void testSelect() {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		String sql = "select * from user where username = 'linlan'";
		List<User> list = userDaoImpl.select(sql);
		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(list);
		System.out.println(json);
		System.out.println("=======================");
		
		 @SuppressWarnings("unchecked")
		List<User> fromJson = gson.fromJson(json, List.class);
		 System.out.println(fromJson.get(0));
		 System.out.println("-------------");
		TypeToken<List<User>> listType = new TypeToken<List<User>>() {};
		//Returns the raw (non-generic) type for this type.
		System.out.println(listType.getRawType().getName());//-->interface java.util.List
		System.out.println(listType.getType());
		// Gets underlying Type instance.
		List<User> users = gson.fromJson(json, listType.getType());//-->java.util.List<com.linfeng.bean.User>
		System.out.println(users);
		for (User user : list) {
			System.out.println(user);
			
		}
	}

}
