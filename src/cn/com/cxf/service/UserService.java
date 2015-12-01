package cn.com.cxf.service;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import cn.com.cxf.domain.Cat;
import cn.com.cxf.domain.User;
import cn.com.cxf.ws.util.FkXmlAdapter;

public interface UserService {

	List<Cat> getCatsByUser(User user);

	Map<String, Cat> getAllCats();

}
