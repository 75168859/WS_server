package cn.com.cxf.ws;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import cn.com.cxf.domain.Cat;
import cn.com.cxf.domain.User;
import cn.com.cxf.ws.util.FkXmlAdapter;

@WebService
public interface HelloWorld {
	
	public String sayHi(String name);
	public List<Cat> getCatsByUser(User user);
	//CXF不能处理Map<String,Cat> 类型，于是我们采用FkXmlAdapter进行处理
	@XmlJavaTypeAdapter(FkXmlAdapter.class) Map<String, Cat> getAllCats();
}
