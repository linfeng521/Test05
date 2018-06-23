package com.linfeng.dao;

import java.util.List;

import com.linfeng.bean.User;

public interface UserDao {
	
	//插入一条数据, 返回生成的主键值
	public int insert(User user);
	
	public List<User> select(String sql);
}
