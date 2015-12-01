package cn.com.cxf.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.com.cxf.domain.Cat;
import cn.com.cxf.domain.User;
import cn.com.cxf.service.UserService;

public class UserServiceImpl implements UserService {

	//用HashMap来模拟内存中的数据库
	static Map<User, List<Cat>> catDb = new HashMap<User, List<Cat>>();
	static{
		List<Cat> catList1 = new ArrayList<Cat>();
		catList1.add(new Cat(1,"M1","CCC1"));
		catList1.add(new Cat(2,"M2","CCC2"));
		catDb.put(new User(1, "u111", "111", "地址1111"), catList1);
		
		List<Cat> catList2 = new ArrayList<Cat>();
		catList2.add(new Cat(3,"M3","CCC4"));
		catList2.add(new Cat(4,"M4","CCC4"));
		catDb.put(new User(2, "u2", "222", "地址222"), catList2);
	}
	
	@Override
	public List<Cat> getCatsByUser(User user) {
		return catDb.get(user);
	}

	@Override
	public Map<String, Cat> getAllCats() {
		Map<String, Cat> result = new HashMap<String, Cat>();
		int i = 1;
		for (List<Cat> cats : catDb.values() ) {
			for (Cat cat : cats) {
				result.put("第" + i++ + "个", cat);
			}
		}
		return result;
	} 

}
