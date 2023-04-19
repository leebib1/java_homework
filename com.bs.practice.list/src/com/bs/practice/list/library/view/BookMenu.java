package com.bs.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.bs.practice.list.library.controller.BookController;
import com.bs.practice.list.library.vo.Book;

public class BookMenu {
	Scanner sc=new Scanner(System.in);
	BookController bc=new BookController();
	
	//메인 메뉴를 선택할 수 있는 기능
	public void mainMenu() {
		int order=0;
		boolean flag=false;
		System.out.println("*********메인 메뉴*********");
		while(true) {
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 : ");
		order=sc.nextInt();

			switch(order) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break;
			}
		
		}
		//while(!flag);
	}
	
	//도서 추가를 위해 정보를 받는 메소드
	public void insertBook() {
		sc.nextLine();
		String result="";
		System.out.println("=====새로운 도서 추가=====");
		System.out.print("도서명 : ");
		String title=sc.nextLine();
		System.out.print("저자명 : ");
		String author=sc.nextLine();
		System.out.print("1.인문 / 2.자연과학 / 3.의료 / 4.기타 \n번호 입력 : ");
		int category=sc.nextInt();
		System.out.print("가격 : ");
		int price=sc.nextInt();
		
		switch(category) {
		case 1 : result="인문"; break;
		case 2 : result="자연과학"; break;
		case 3 : result="의료"; break;
		case 4 : result="기타"; break;
		default : System.out.println("잘못 입력하였습니다.");
		System.out.println(); break;
		}
		
		Book bk=new Book(title, author, result, price);
		bc.insertBook(bk);
	}
	
	//전체 도서 목록 출력 성공을 알리는 메소드
	public void selectList() {
		System.out.println("=====전체 도서 조회=====");
		ArrayList b=bc.selectList();
		if(b==null) System.out.println("존재하는 도서가 없습니다.");
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i));
		}
	}
	
	//특정 도서 검색 결과를 보여주는 메소드
	public void searchBook() {
		System.out.println("=====도서명 검색=====");
		sc.nextLine();
		String keyword="";
		System.out.print("검색할 도서명 : ");
		keyword=sc.nextLine();
		for(int i=0;i<bc.searchBook(keyword).size();i++) {
				System.out.println(bc.searchBook(keyword).get(i));
		}
	}
	
	//특정 도서 삭제 성공을 알리는 메소드
	public void deleteBook() {
		System.out.println("=====도서 삭제=====");
		sc.nextLine();
		System.out.print("삭제할 도서명 : ");
		String title=sc.nextLine();
		System.out.print("삭제할 저자명 : ");
		String author=sc.nextLine();
		Book remove=bc.deleteBook(title, author);
		System.out.println(remove==null?"삭제할 도서를 찾지 못했습니다.":"성공적으로 삭제되었습니다.");
	}
	
	//책명을 오름차순으로 정렬 성공을 알리는 메소드
	public void ascBook() {
		if(bc.ascBook()>0) {
			System.out.println("정렬에 성공하였습니다.");
		}else System.out.println("정렬에 실패하였습니다.");
	}
}
