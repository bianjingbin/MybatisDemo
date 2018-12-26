/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： JdbcExample.java
 * 注意事项：
 * Id: JdbcExample.java,v3.0 2018年12月5日 bianjingbin Exp
 * ==============================================
 */
package com.bian.litdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcExample {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl","bian","bian");
		PreparedStatement ps=null;
		ResultSet rs=null;
		ps=con.prepareStatement("select * from dept where dept_id=1");
		rs=ps.executeQuery();
		while(rs.next()) {
			Integer did=rs.getInt("dept_id");
			String bid=rs.getString("branch_id");
			String dname=rs.getString("dept_name");
			System.out.println("dept_id: " + did +"      branch_id: "+bid+"        dept_name:"+dname);
		}
		con.close();
		ps.close();
		rs.close();
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */