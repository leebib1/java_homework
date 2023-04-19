package com.bs.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Comparator;

import com.bs.practice.list.library.vo.Book;

public class BookController {
	ArrayList bookList=new ArrayList();
	
	public BookController() {
		bookList.add(new Book("자바의 정석","남궁 성","기타",20000));
		bookList.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		bookList.add(new Book("대화의 기술","강보람","인문",17500));
		bookList.add(new Book("암 정복기","박신우","의료",21000));
	}
	
	//리스트에 새책 추가
	public void insertBook(Book bk) {
		if(bk!=null) {
			bookList.add(bk);
		}else System.out.println("입력 받은 책이 없습니다.");
	}
	
	//전체 도서 출력
	public ArrayList selectList() {
		return bookList;
	}
	
	//정보로 도서 조회
	public ArrayList searchBook(String keyword) {
		ArrayList result = new ArrayList();
		for (int i = 0; i < bookList.size(); i++) {
			if ((((Book)bookList.get(i)).getTitle()).contains(keyword)) {
				result.add(bookList.get(i));
			}
		}
		return result;
	}
	
	//제목과 저자로 책을 삭제
	public Book deleteBook(String title, String author) {
		Book remove=new Book();
		for(int i=0;i<bookList.size();i++) {
			Book b=(Book)bookList.get(i);
			if(b.getTitle().equals(title)&&b.getAuthor().equals(author)) {
				remove=b;
				bookList.remove(i);
			}
		}
		return remove;
	}
	
	//책 이름 오름차순 정렬
	public int ascBook() {
		bookList.sort(new Comparator() {
			@Override
			public int compare(Object o, Object o1) {
				Book prev=(Book)o;
				Book next=(Book)o1;
				if(prev.getTitle().compareTo(next.getTitle())==0) {
					return prev.getPrice()-next.getPrice();
				}
				return prev.getTitle().compareTo(next.getTitle());
			}
		});return 1;
	}
}
