/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： MyBatisUtil.java
 * 注意事项：
 * Id: MyBatisUtil.java,v3.0 2018年12月5日 bianjingbin Exp
 * ==============================================
 */
package com.bian;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory sqlSessionFactory=null;
	public static SqlSessionFactory getSqlSessionFactory() {
		InputStream in=null;
		if(sqlSessionFactory==null) {
			String resource="com/bian/mybatis_config.xml";
			try {
				sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
				return sqlSessionFactory;
			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */