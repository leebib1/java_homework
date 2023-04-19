package com.bs.practice2.func;
import java.util.Scanner;
public class CastingPractice1 {
	public void test1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char ch=sc.next().charAt(0);
		System.out.println((int)ch);
	}

}
