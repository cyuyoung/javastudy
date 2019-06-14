package ch07;
import java.util.Scanner;

public class PersonMain {
	static Person inputDate() {
        Person p1 =  new Person();
        
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 사람의 정보를 입력해주세요");
		System.out.println("이름 : ");
		String name = s.nextLine();
		p1.name = name;
		
		System.out.print("키 :");
		float height = s.nextFloat();
		p1.height = height;
		
		System.out.print("몸무게 :");
		float weight = s.nextFloat();
		p1.weight = weight;
	
		return p1; //참자료형들의 기본값 null
	
	
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
