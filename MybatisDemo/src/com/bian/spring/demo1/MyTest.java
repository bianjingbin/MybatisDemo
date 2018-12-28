/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： MyTest.java
 * 注意事项：
 * Id: MyTest.java,v3.0 2018年12月26日 bianjingbin Exp
 * ==============================================
 */
package com.bian.spring.demo1;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class MyTest {
	
	@Test
	public static void main(String[] args) throws BeansException, MalformedURLException {
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean=(MyTestBean) bf.getBean("MyTestBean");
		assertEquals("testStr", bean.getStr());
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */