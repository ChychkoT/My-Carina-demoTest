package com.roxsoft.carina_demoTest.onlainer.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;

public class MyBatisUserlogin extends SessionFactory implements IUserLogin{
	
	//private SqlSessionFactory sqlSessionFactory = null;
	
	@Override
	public List<UserloginTable> getAllLoginData() {
		SqlSession session = null;
		//List<UserloginTable> dataList;
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList("dao.MyBatisUserlogin.getAllLoginData");
		} finally {
			session.close();
		}
	}

}
