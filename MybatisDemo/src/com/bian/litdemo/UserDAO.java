/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： SampleDAO.java
 * 注意事项：
 * Id: SampleDAO.java,v3.0 2018年12月4日 bianjingbin Exp
 * ==============================================
 */
package com.bian.litdemo;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class UserDAO {
	private DataSource dataSource;
	
	private PlatformTransactionManager platformTransactionManager;

	public PlatformTransactionManager getPlatformTransactionManager() {
		return platformTransactionManager;
	}

	public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
		this.platformTransactionManager = platformTransactionManager;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insertDept() {
		TransactionTemplate tt=new TransactionTemplate(getPlatformTransactionManager());
		tt.execute(new TransactionCallback() {
			@Override
			public Object doInTransaction(TransactionStatus status) {
				JdbcTemplate jt = new JdbcTemplate(getDataSource());
				jt.update("insert into dept(dept_id,branch_id,dept_name) values('8','99','spring部1')");
				return null;
			}
		});
		
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */