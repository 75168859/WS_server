package cn.com.cxf.ws.util;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import cn.com.cxf.domain.Cat;
import cn.com.cxf.ws.util.StringCat.Entry;

//该转换器负责完成StringCat 与Map<String,Cat>的相互转换
public class FkXmlAdapter extends XmlAdapter<StringCat, Map<String,Cat>>{

	@Override
	public Map<String, Cat> unmarshal(StringCat v) throws Exception {
		Map<String, Cat> result = new HashMap<String, Cat>();
		for(Entry entry : v.getEntries()){
			result.put(entry.getKey(),entry.getValue());
		}
		return result;
	}

	@Override
	public StringCat marshal(Map<String, Cat> v) throws Exception {
		StringCat sc = new StringCat();
		for (String key : v.keySet()) {
			sc.getEntries().add(new Entry(key,v.get(key)));
		}
		return sc;
	}

}
