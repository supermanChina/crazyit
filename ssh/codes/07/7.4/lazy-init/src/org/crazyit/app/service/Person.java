package org.crazyit.app.service;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Person
{
	public Person()
	{
		System.out.println("==正在执行Person无参数的构造器==");
	}
	public void setTest(String name)
	{
		System.out.println("正在调用setName()方法，传入参数为：" + name);
	}
}
