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
    	System.out.println("���� �Է����ּ���");
		//��������
    	int num = input();
    	
    	
    	System.out.println("�Էµ� ����?" + num); 
	}
}


