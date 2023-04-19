package com.bs.practice.chap01;
import java.util.Scanner;
public class ControlPractice {
	Scanner sc=new Scanner(System.in);
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호 입력 : ");
		int order=sc.nextInt();
		
		switch (order) {
		case 1 : System.out.println("입력 메뉴 입니다."); break;
		case 2 : System.out.println("수정 메뉴 입니다."); break;
		case 3 : System.out.println("조회 메뉴 입니다."); break;
		case 4 : System.out.println("삭제 메뉴 입니다."); break;
		case 7 : System.out.println("종료 메뉴 입니다."); break;
		default : System.out.println("잘못 입력했습니다.");
		}
	}
	
	public void practice2() {
		System.out.print("숫자를 하나 입력하세요 : ");
		int num=sc.nextInt();
		if (num<=0) {
			System.out.println("양수만 입력해주세요");
		}else if(num%2==0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
	}
	
	public void practice3() {
		System.out.print("국어 점수 : ");
		int kor=sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng=sc.nextInt();
		System.out.print("수학 점수 : ");
		int math=sc.nextInt();
		
		int total=kor+eng+math;
		
		if(kor>=40&&eng>=40&&kor>=40&&(total/3.0)>=60) {
			System.out.println("축하합니다, 합격입니다!");
			System.out.println("국어 : "+kor+", 영어 : "+eng+", 수학 : "+math);
			System.out.println("합계 : "+total+", 평균 : "+(total/3.0));
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		System.out.print("달 입력 : ");
		int month=sc.nextInt();
		String season="";
		switch(month) {
		case 1,2,12 : season="겨울"; break;
		case 3,4,5 : season="봄"; break;
		case 6,7,8 : season="여름"; break;
		case 9,10,11 : season="가을"; break;
		default : System.out.println("잘못 입력했습니다.");
		}
		System.out.println(season);
	}
	
	public void practice5() {
		
		System.out.print("ID : ");
		sc.nextLine();
		String id=sc.nextLine();
		System.out.print("PW : ");
		String pw=sc.nextLine();
		if (id.equals("lee")&&pw.equals("0717")) {
			System.out.println("로그인 성공!");
		}else if(id.equals("lee")) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(pw.equals("0717")) {
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("아이디/비밀번호를 확인해주세요.");
		}
	}
	
	public void practice6() {
		System.out.print("관리자, 회원, 비회원 중에 입력하세요 : ");
		String user=sc.nextLine();
		if (user.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
		}else if(user.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}else if(user.equals("비회원")) {
			System.out.println("게시글 조회");
		}else {
			System.out.println("해당 값을 찾을 수 없습니다.");
		}
	}
	
	public void practice7() {
		System.out.print("키(m) : ");
		double m=sc.nextDouble();
		System.out.print("몸무게(kg) : ");
		double kg=sc.nextDouble();
		double bmi=kg/(m*m);
		System.out.println("BMI 지수 : "+bmi);
		if (bmi<18.5) {
			System.out.println("저체중");
		}else if(bmi<23) {
			System.out.println("정상체중");
		}else if(bmi<25) {
			System.out.println("과체중");
		}else if(bmi<30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
	}
	
	public void practice8() {
		int total = 0;
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1>0&&num2>0) {

		System.out.println("===계산===");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.print("번호 : ");
		int oper = sc.nextInt();

		switch (oper) {
		case 1:
			total = num1 + num2;
			System.out.println(num1+"+"+num2+"="+total);
			break;
		case 2:
			total = num2 - num2;
			System.out.println(num1+"-"+num2+"="+total);
			break;
		case 3:
			total = num1 * num2;
			System.out.println(num1+"*"+num2+"="+total);
			break;
		case 4:
			total = num1 / num2;
			System.out.println(num1+"/"+num2+"="+(double)total);
			break;
		}

		}else {
			System.out.println("잘못 입력하셨습니다. 프로그램 종료합니다.");
		}
	}
	
	public void practice9() {
		System.out.print("중간고사 점수 : ");
		int meddle=sc.nextInt();
		System.out.print("기말고사 점수 : ");
		int last=sc.nextInt();
		System.out.print("과제 점수 : ");
		int project=sc.nextInt();
		System.out.print("출석회수(20회) : ");
		int chul=sc.nextInt()*5;
		double result=(meddle*0.2)+(last*0.3)+(project*0.3)+(chul*0.2);
		
		System.out.println("=======결과======");
		System.out.println("중간 점수(20) : "+meddle*0.2);
		System.out.println("기말 점수(30) : "+last*0.3);
		System.out.println("과제 점수(30) : "+project*0.3);
		System.out.println("출석 점수(20) : "+chul*0.2);
		System.out.println("총점 : "+result);
		
		if (chul<=70) {
			System.out.println("Fail [출석 회수 부족] ("+chul/5+"/20)]");
		}else if(result<70) {
			System.out.println("Fail");
		}else {
			System.out.println("Pass");
		}
	}
	
	public void practice10() {
		System.out.println("==원하는 기능을 호출하세요==");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.print("번호 입력 : ");
		int order = sc.nextInt();

		switch (order) {
		case 1:
			practice1(); break;
		case 2:
			practice2(); break;
		case 3:
			practice3(); break;
		case 4:
			practice4(); break;
		case 5:
			practice5(); break;
		case 6:
			practice6(); break;
		case 7:
			practice7(); break;
		case 8:
			practice7(); break;
		case 9:
			practice9(); break;
		}

	}

}
