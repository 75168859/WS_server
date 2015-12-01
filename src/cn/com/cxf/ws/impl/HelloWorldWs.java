package cn.com.cxf.ws.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import cn.com.cxf.domain.Cat;
import cn.com.cxf.domain.User;
import cn.com.cxf.service.UserService;
import cn.com.cxf.service.impl.UserServiceImpl;
import cn.com.cxf.ws.HelloWorld;

/*
 * endpointInterface:ָ��ʵ�ֵĽӿ�
 * serviceName��
 */
@WebService(endpointInterface="cn.com.cxf.ws.HelloWorld",serviceName="HelloWorldWs")
public class HelloWorldWs implements HelloWorld {

	@Override
	public String sayHi(String name) {

		return name
				+ "ssssss---"
				+ new SimpleDateFormat("yyyy-mm-dd HH:MM:ss")
						.format(new Date());
	}

	@Override
	public List<Cat> getCatsByUser(User user) {
		//��ʵ����Ŀ�У�Web service����Լ�������ȥʵ��ҵ����
		//��ֻ�ǵ���ҵ���߼�����ķ�������¶ Web Service
		UserService us = new UserServiceImpl();
		return us.getCatsByUser(user);
	}

	@Override
	public Map<String, Cat> getAllCats() {
		
		UserService us = new UserServiceImpl();
		return us.getAllCats();
	}

}
