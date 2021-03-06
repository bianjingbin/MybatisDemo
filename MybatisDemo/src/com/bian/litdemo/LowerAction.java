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
package com.bian.litdemo;

public class LowerAction implements Action{

	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String str) {
		message=str;
	}
	
	@Override
	public String execute(String str) {
		return (getMessage()+" "+str).toLowerCase();
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */