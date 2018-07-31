package com.linfeng.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.linfeng.util.JdbcUtils;

public class UtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetCon() {
		Connection conn;
		try {
			conn = JdbcUtils.getConnection();
			System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
