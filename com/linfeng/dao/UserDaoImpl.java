package com.linfeng.dao;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.linfeng.bean.User;
import com.linfeng.util.JdbcUtils;

public class UserDaoImpl implements UserDao {

	@Override
	/**
	 * 
	 */
	public int insert(User user) {
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "insert into User(username,password) values (?,?)";
		BigInteger id = null;
		String sql2 = "select @@identity";
		try {
			qr.update(sql, user.getUsername() , user.getPassword());
			id = (BigInteger) qr.query(sql2, new ScalarHandler<Object>(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id.intValue();
	}

	@Override
	public List<User> select(String sql) {
		QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
		List<User> list = null;
		try {
			list = qr.query(sql, new BeanListHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
