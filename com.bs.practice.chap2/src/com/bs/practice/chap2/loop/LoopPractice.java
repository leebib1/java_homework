package com.bs.practice.chap2.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int num = 0;
		System.out.print("입력 : ");
		num = sc.nextInt();
		if (num >= 1) {
			for (int i = 0; i < num; i++) {
				System.out.print(i + 1 + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice2() {
		int num = 0;
		while (num <= 0) {
			System.out.print("입력 : ");
			num = sc.nextInt();
			if (num >= 1) {
				for (int i = 0; i < num; i++) {
					System.out.print(i + 1 + " ");
				}
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void practice3() {
		int num = 0;
		System.out.print("입력 : ");
		num = sc.nextInt();
		if (num >= 1) {
			for (int i = 0; i < num; i++) {
				System.out.print(num - i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력하세요.");
		}
	}
	
	public void practice4() {
		int num = 0;
		while (num <= 0) {
			System.out.print("입력 : ");
			num = sc.nextInt();
			if (num >= 1) {
				for (int i = 0; i < num; i++) {
					System.out.print(num - i + " ");
				}
			}else {
				System.out.println("1이상의 숫자를 입력하세요.");
			}
		}
	}
	
	public void practice5() {
		int num=0;
		int total=0;
		System.out.print("입력 : ");
		num=sc.nextInt();
		for(int i=0;i<=num;i++) {
			total+=i;
		}System.out.print(total);
	}
	
	public void practice6() {
		System.out.print("입력 : ");
		int num1=sc.nextInt();
		System.out.print("입력 : ");
		int num2=sc.nextInt();
		if(num1<1||num2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else if(num1>num2) {
			for(int i=0;i<=(num1-num2);i++) {
				System.out.print(num2+i+" ");
			}
		}else {
			for(int i=0;i<=(num2-num1);i++) {
				System.out.print(num1+i+" ");
			}
		}	
	}
	
	public void practice7() {
		int num1=0;
		int num2=0;
		while(num1<=0||num2<=0){
		System.out.print("입력 : ");
		num1=sc.nextInt();
		System.out.print("입력 : ");
		num2=sc.nextInt();
		if(num1<1||num2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		}
		if(num1>num2) {
			for(int i=0;i<=(num1-num2);i++) {
				System.out.print(num2+i+" ");
			}
		}else {
			for(int i=0;i<=(num2-num1);i++) {
				System.out.print(num1+i+" ");
			}
		}
		
	}
	
	public void practice8() {
		System.out.print("단 입력 : ");
		int num=sc.nextInt();
		System.out.println("======"+num+"단 =====");
		for(int i=1;i<10;i++) {
			System.out.println(num+" * "+i+" = "+i*num);
		}
		
	}
	
	public void practice9() {
		System.out.print("단 입력 : ");
		int num=sc.nextInt();
		if (num <= 9) {
			for (int i = num; i < 10; i++) {
				System.out.println("======" + num + "단 =====");
				for (int j = 1; j < 10; j++) {
					System.out.println(num + " * " + j + " = " + j * num);
				}
				num += 1;
			}
		}else { System.out.println("9 이하의 숫자만 입력해주세요.");}
	}
	
	public void practice10() {
		int num = 0;
		while (num < 10) {
			System.out.print("단 입력 : ");
			num = sc.nextInt();
			if (num <= 9) {
				for (int i = num; i < 10; i++) {
					System.out.println("======" + num + "단 =====");
					for (int j = 1; j < 10; j++) {
						System.out.println(num + " * " + j + " = " + j * num);
					}
					num += 1;
				}
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				num = 0;
			}
		}
	}
	
	public void practice11() {
		int startNum=0;
		int num=0;
		System.out.print("시작 숫자 : ");
		startNum=sc.nextInt();
		System.out.print("공차 : ");
		num=sc.nextInt();
		for(int i=0;i<10;i++) {
			System.out.print(startNum+" ");
			startNum+=num;
		}
	}
	
	public void practice12() {
		int num1=0;
		int num2=0;
		int total=0;
		String oper=" ";
		do {
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			oper = sc.next();
			if(oper.equals("exit")) break;
			System.out.print("정수1 입력 : ");
			num1 = sc.nextInt();
			System.out.print("정수2 입력 : ");
			num2 = sc.nextInt();

			if (num1 > 0 && num2 > 0) {
				switch (oper) {
				case "+" : total = num1 + num2; break;
				case "-" : total = num1 - num2; break;
				case "*" : total = num1 * num2; break;
				case "/" : total = num1 / num2; break;
				case "%" : total = num1 % num2; break;
				}
			}
			if ((num1 == 0 || num2 == 0) && oper.equals("/")) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			} else if (!oper.equals("exit")) {
				System.out.println(num1 + oper + num2 + " = " + total);
			}
		} while (!oper.equals("exit"));
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void practice13() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public void practice14() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print("*");
			for(int j=0;j<i;j++) {
				System.out.print("*");
				System.out.println();
			}
		}
	}
}
