package ch06;

import java.util.Scanner;

public class Method1 {
	//Ŭ���� �߰�ȣ �ȿ�
	//��������, ������� <= Ŭ���� ����
	int age;
	
	
	static int input() {
	//��������
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
		
	}
	
     public static void main(String[] args) {
    	 
    	 Method1 m = new Method1();
    	 m.input();
    	 
    	 new Method1().input();
    	 
    	 
    
	}
}


