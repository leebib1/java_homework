package com.bs.practece.map.view;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.bs.practece.map.controller.MemberController;
import com.bs.practece.map.model.vo.Member;

public class MemberMenu {
	MemberController controller=new MemberController();
	Scanner sc=new Scanner(System.in);
	//메인메뉴
	public void mainMenu() {
		int order=0;
		while (true) {
			System.out.println("==============BS 사이트=============");
			System.out.println("=========메인 메뉴==========");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("번호 입력 : ");
			order=sc.nextInt();
			
			switch(order){
				case 1: joinMembership(); break;
				case 2: logIn(); memberMenu(); break;
				case 3: sameName(); break;
				case 9: System.out.println("프로그램 종료"); return;
				default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break; 
			}
		}
	}
	
	//회원메뉴 선택
	public void memberMenu() {
		int order=0;
		while (true) {
			System.out.println("=========회원 메뉴==========");
			System.out.println("1. 비밀번호 변경");
			System.out.println("2. 이름 변경");
			System.out.println("3. 로그아웃");
			System.out.print("번호 입력 : ");
			order=sc.nextInt();
			
			switch(order){
				case 1: changePassword(); break;
				case 2: changeName(); break;
				case 3: System.out.println("로그아웃 되었습니다."); return;
				default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break; 
			}
		}
	}
	
	//회원가입 성공여부를 알리는 메소드
	public void joinMembership() {
		Member m=new Member();
		sc.nextLine();
		System.out.println("==========회원가입==========");
		System.out.print("회원 아이디 : ");
		String id=sc.nextLine();
		System.out.print("회원 비밀번호 : ");
		m.setPassword(sc.nextLine());
		System.out.print("회원 이름 : ");
		m.setName(sc.nextLine());
		
		if(controller.joinMembership(id, m)) System.out.println("성공적으로 회원가입 완료하였습니다.");
		else System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		
	}
	
	//로그인 성공 여부를 알리는 메소드
	public void logIn() {
		sc.nextLine();
		System.out.println("=========로그인========");
		System.out.print("회원 아이디 : ");
		String id=sc.nextLine();
		System.out.print("회원 비밀번호 : ");
		String pwd=sc.nextLine();
		
		if(controller.logIn(id, pwd)!=null) {
			System.out.println(controller.logIn(id, pwd)+"님, 환영합니다!");
		}else System.out.println("틀린 아이디 또는 비밀번호입니다.");
	}
	
	//비밀번호 변경 성공을 알리는 메소드
	public void changePassword() {
		sc.nextLine();
		boolean start = true;
		while (start) {
			System.out.println("=========이름 변경========");
			System.out.print("회원 아이디 : ");
			String id = sc.nextLine();
			System.out.print("이전 비밀번호 : ");
			String oldPwd = sc.nextLine();
			System.out.print("새로운 비밀번호 : ");
			String newPwd = sc.nextLine();

			if (controller.changePassword(id, oldPwd, newPwd)) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				start = false;
			} else
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
		}
	}
	
	//이름 변경 성공 여부를 알리는 메소드
	public void changeName() {
		Member m=new Member();
		sc.nextLine();
		boolean start = true;
		while (start) {
			System.out.println("=========이름 변경========");
			System.out.print("회원 아이디 : ");
			String id=sc.nextLine();
			System.out.print("회원 비밀번호 : ");
			String pwd=sc.nextLine();
			
			if(controller.logIn(id, pwd)!=null) {
				System.out.println("현재 설정된 이름 : "+controller.logIn(id, pwd));
				System.out.print("변경할 이름 : ");
				String newName=sc.nextLine();
				controller.changeName(id, newName);
				System.out.println("이름 변경에 성공하였습니다.");
				start=false;
			}else System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
		}
	}
	
	//같은 이름을 가진 사람들을 출력하는 메소드
	public void sameName() {
		sc.nextLine();
		System.out.println("=========동일 이름 검색========");
		System.out.print("검색할 이름 : ");
		String name=sc.nextLine();
		TreeMap members=controller.sameName(name);

		Set entry=members.entrySet();
		Iterator it=entry.iterator();
		while(it.hasNext()) {
//			System.out.println(name+" - "+);
//			Map.Entry all=(Map.Entry)it.next();
			Map.Entry names=(Map.Entry)it.next();
			System.out.println(names.getValue()+" "+names.getKey());
		}
		
	}
}
