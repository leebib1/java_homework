package com.bs.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc=new Scanner(System.in);

	public void practice1() {
		int[] arr=new int[10];
		for (int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice2() {
		int[] arr=new int[10];
		for (int i=0;i<arr.length;i++) {
			arr[i]=arr.length-i;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice3() {
		System.out.print("정수 입력 : ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
		String[] arr={"사과","귤","포도","복숭아","참외"};
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String str=sc.next();
		System.out.print("문자 : ");
		char ch=sc.next().charAt(0);
		int[] arr=new int[str.length()];
		int count=0;
		System.out.print(str+"에 "+ch+"가 존재하는 위치 : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=str.charAt(i);
			if(arr[i]==ch) {
				System.out.print(i+1+" ");
				count+=1;
			}
		}
		System.out.println();
		System.out.println(ch+" 개수  : "+count);
	}
	
	public void practice6() {
		String[] week= {"월","화","수","목","금","토","일"};
		System.out.print("0~6 사이 숫자 입력 : ");
		int num=sc.nextInt();
		for(int i=0;i<week.length;i++) {
			if(num==i) {
			System.out.println(week[i]);
			}
		}
		if(num>6) {
			System.out.println("잘못 입력하셧습니다.");
		}
	}
	
	public void practice7() {
		System.out.print("배열 길이 : ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		int total=0;
		for (int i=0;i<arr.length;i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			total+=arr[i];
		}
		System.out.println("총 합 : "+total);	
	}
	
	public void practice8() {
		int num = 0;
		
		
		while(num%2==0||num<3) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			System.out.println("다시 입력하세요.");
			
		}
		int[] arr = new int[num];
		
		for (int i = 0; i <= num/2; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]);
		}
		for(int i=0;i<num/2;i++){
			arr[i]=num/2-i;
			System.out.print(arr[i]);
		}
	}
	
	public void practice9() {
		String[] menu= {"후라이드","양념","반반","마늘간장"};
		System.out.print("치킨 메뉴 입력 : ");
		String order=sc.next();
		String msg="";
		for (int i=0;i<menu.length;i++) {
			if(menu[i].equals(order)) {
				msg=" 배달 가능"; break;
			}else if(!menu[i].equals(order)) {
				msg="은/는 없는 메뉴입니다.";
			}
		}System.out.println(order+msg);
			
		
	}
	
	public void practice10() {
		System.out.print("주민등록번호(-포함) : ");
		String num= sc.next();
		char[] arr=new char[num.length()];
		char[] copy=new char[num.length()];
		for(int i=0;i<num.length();i++) {
			arr[i]=num.charAt(i);
			copy[i]='*';
		}
		System.arraycopy(arr, 0, copy, 0, 8);
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]);
		}
	}
	
	public void practice11() {
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*10)+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice12() {
		int[] arr = new int[10];
		int max = 0, min = 10;
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
			System.out.print(arr[i] + " ");
			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
		}
				System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	
	public void practice13() {
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*10)+1;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--; break;
				}
			}
		}for (int a:arr) {
			System.out.print(a+" ");
		}
	}
	
	public void practice14() {
		int[] rotto=new int[6];
		for (int i=0;i<rotto.length;i++) {
			rotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(rotto[i]==rotto[j]) {
					i--; break;
				}
			}
		}
		Arrays.sort(rotto);
		for(int r:rotto) {
			System.out.print(r+" ");
		}
	}
	
	public void practice15() {
		System.out.print("문자열 : ");
		String str=sc.nextLine();
		int count=0;
		char[] strArr=new char[str.length()];
		for(int i=0;i<strArr.length;i++) {
			strArr[i]=str.charAt(i);
			for(int j=0;j<i;j++) {
				if(strArr[i]==strArr[j]) {
					strArr[i]=strArr[j];
					i--;
					count++;
				}
			}
			System.out.print(strArr[i]+" ");
		}
		System.out.println(strArr);
		System.out.println(count);
	}
	
	
	public void practice16() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int num=sc.nextInt();
		String[] arr=new String[num];
		String[] copy=new String[num];
		sc.nextLine();
		char answer=' ';
		int plus=0;
		for(int i=0;i<num;i++) {
			System.out.print(i+1+"번째 문자열 : ");
			arr[i]=sc.nextLine();
		}
		do {
			System.out.print("더 입력 하시겠습니까?(Y/N) : ");
			answer=sc.next().charAt(0);
			System.out.print("더 입력하고 싶은 개수 : ");
			num+=sc.nextInt();
			System.arraycopy(arr, 0, copy, 0, num);
			sc.nextLine();
			for(int i=0;i<arr.length;i++) {
				if(arr[i].equals(null)) {
					arr[i]=sc.nextLine();
				}
			}
		}while(answer=='Y'||answer=='y');
	}
	
}
