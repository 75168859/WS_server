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
 * endpointInterface:指定实现的接口
 * serviceName：
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
		//在实际项目中，Web service组件自己并不会去实现业务功能
		//它只是调用业务逻辑组件的方法来暴露 Web Service
		UserService us = new UserServiceImpl();
		return us.getCatsByUser(user);
	}

	@Override
	public Map<String, Cat> getAllCats() {
		
		UserService us = new UserServiceImpl();
		return us.getAllCats();
	}

}
