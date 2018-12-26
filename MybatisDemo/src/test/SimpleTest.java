/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Action.java
 * 注意事项：
 * Id: Action.java,v3.0 2018年12月4日 bianjingbin Exp
 * ==============================================
 */
package test;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.bian.litdemo.Dept;
import com.bian.litdemo.DeptMapper;
import com.bian.litdemo.MyBatisUtil;

public class SimpleTest {
	public static void main(String[] args) throws Exception {
		/*ApplicationContext ctx=new FileSystemXmlApplicationContext("bean.xml");
		Action action=(Action) ctx.getBean("TheAction");
		System.out.println(action.execute("Rod"));*/
		
		/*ApplicationContext ctx=new FileSystemXmlApplicationContext("ApplicationContext.xml");
		UserDAO action=(UserDAO) ctx.getBean("userDAO");
		action.insertDept();*/
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("id", 4);
		SqlSession sqlSession=null;
		sqlSession=MyBatisUtil.getSqlSessionFactory().openSession();
		DeptMapper deptMapper=sqlSession.getMapper(DeptMapper.class);
		System.out.println(deptMapper.getDept(map));
		sqlSession.close();
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */