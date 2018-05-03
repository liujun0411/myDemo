package com.lj.entity;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	
	public static SqlSession getSqlSession() {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis.xml");
			SqlSessionFactory sqf = new SqlSessionFactoryBuilder().build(is);
			return sqf.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	

}
