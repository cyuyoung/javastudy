package ch06;

import java.util.Scanner;

public class Method1 {
	//클래스 중괄호 안에
	//전역변수, 멤버변수 <= 클래스 영역
	int age;
	
	
	static int input() {
	//지역변수
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
		
	}
	
     public static void main(String[] args) {
    	System.out.println("값을 입력해주세요");
		//지역변수
    	int num = input();
    	
    	
    	System.out.println("입력된 값은?" + num); 
	}
}


