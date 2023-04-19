package com.bs.practice.token.view;

import java.util.Scanner;
import com.bs.practice.token.controller.TokenController;

public class TokenMenu {

	Scanner sc=new Scanner(System.in);
	private TokenController tc=new TokenController();
	
	//메인메뉴 출력
	public void mainMenu() {
		int num = 0;
		do {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			if (num == 1) {
				tokenMenu();
			} else if (num == 2) {
				inputMenu();
			} else if (num == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		} while(num != 9); System.out.println("잘못 입력하셧습니다. 다시 입력해주세요.");

	}
	
	//토큰 처리 전,후 출력
	public void tokenMenu() {
		String str="J a v a P r o g r a m";
		System.out.println("토큰 처리 전 문자 : "+str);
		System.out.println("토큰 처리 전 갯수 : "+str.length());
		str.trim();
		System.out.println("토큰 처리 후 문자 : "+str);
		System.out.println("토큰 처리 후 갯수 : "+str.length());
	}
	
	//첫글자 대문자와 찾을 문자 몇개 있는지 출력
	public void inputMenu(){
		
	}
}
