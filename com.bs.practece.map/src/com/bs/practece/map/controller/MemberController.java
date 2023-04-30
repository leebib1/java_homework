package com.bs.practece.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import com.bs.practece.map.model.vo.Member;

public class MemberController {
	HashMap<String, Member> map=new HashMap();
	
	//회원가입 메소드 - id가 있으면 false, 없으면 객체를 저장하고 true를 반환
	public boolean joinMembership(String id, Member m) {
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		}
		return false;
	}
	
	//로그인 메소드
	public String logIn(String id, String pwd) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(pwd)){
				return map.get(id).getName();
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)&&map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		if(map.containsKey(id)) {
			map.get(id).setName(newName);
		}
	}
	
	public TreeMap sameName(String name) {
		TreeMap<String, String> members=new TreeMap();
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			String key=(String)it.next();
			if(map.get(key).getName().equals(name)) {
				members.put(key, name);
			}
		}
		return members;
	}
}
