package org.crazyit.common.hibernate;

import org.hibernate.event.internal.DefaultLoadEventListener;
import org.hibernate.HibernateException;
import org.hibernate.event.spi.LoadEvent;
import org.hibernate.event.spi.LoadEventListener;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class MyLoadListener extends DefaultLoadEventListener
{
	// ��LoadEventListener�ӿڽ����������������
	public void onLoad(LoadEvent event,
		LoadEventListener.LoadType loadType)
		throws HibernateException
	{
		System.out.println("�Զ����load�¼�");
		System.out.println(event.getEntityClassName()
			+ "==========" + event.getEntityId());
		super.onLoad(event, loadType);
	}
}