package ch07;
import java.util.Scanner;

public class PersonMain {
	static Person inputDate() {
        Person p1 =  new Person();
        
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù��° ����� ������ �Է����ּ���");
		System.out.println("�̸� : ");
		String name = s.nextLine();
		p1.name = name;
		
		System.out.print("Ű :");
		float height = s.nextFloat();
		p1.height = height;
		
		System.out.print("������ :");
		float weight = s.nextFloat();
		p1.weight = weight;
	
		return p1; //���ڷ������� �⺻�� null
	
	
       }


	  static void print(Person) {
		  System.out.printf("%s  %s  %s",
					p.name, p.height, p.weight);
	  }




	public static void main(String[] args) {
		Person p1 = inputDate();
		Person p2 = inputDate();
		
		
		
		
		print(p1);
		print(p2);
		
		
	}

}
