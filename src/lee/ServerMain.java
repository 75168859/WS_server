package lee;

import javax.xml.ws.Endpoint;

import cn.com.cxf.ws.HelloWorld;
import cn.com.cxf.ws.impl.HelloWorldWs;

public class ServerMain {
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorldWs();
		//���� Endpoint��publish�������� Web Service
		Endpoint.publish("http://127.0.0.1:8888/cxfTest", hw);
	}
}
