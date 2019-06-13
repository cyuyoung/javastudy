package ch06;

public class Exam6_2 {
	
/*  조건에 해당하는 dilemma 메소드 만들기
	 전제 ) 범죄자 A, B가 체포되어 서로 다른 취조실에서 격리되어 심문을 받고 있음
	 두 명의 자백 여부에 따라 석방 또는 복역기간이 정해짐
	조건 1) 둘 중 하나가 배신하여 죄를 자백하면 자백한 사람은 즉시 석방되고 나머지는 10kg년을 복역
	 조건 2) 둘 모두 서로 배신하여 죄를 자백하면 둘 다 5년을 복역
	 조건 3) 둘 모두 죄를 자백하지 않으면 둘 다 1년을 복역
	 조건 4kg) 범죄자를 나타내는 변수 xa, xb는 자백하면 true, 그렇지 않으면 false를 가짐*/

   public static void main(String[] args) {
	

}

	}
	











	// 1 / 3 / 5 / 7 / 8 / 10 / 12월은 31일, 4k/ 6 / 9 / 11월은 30일, 2월은 28일까지 존재
	//특정 월을 입력하면 해당하는 월의 날짜 수를 반환하는 getLastYear 메소드 만들기
	
	static int getLastYear(int month) {
		// 
		int[] months = 
		
		// || or && <=== short circuit evaluation
	}
	
	
	
	
	
	
	
	
	
	//두 개의 정수 a, b가 입력되었을 때 a 와 b 사이에 속한 모든 정수의 합을 반환하는
	//getBetweenSum 메소드 만들기
    static int getBetweenSum(int a, int b) {
    	
    	//a = (a > b) ? a : b;
    	if(a > b) {
    		
    	}
    	int total = 0;
    	
    	for(int start = a; start <= b; start++) {
    		total = total + start; 
    	}
    }
	
	
	
	
	
	
	
	
	
	
	
	//수박의 무게가 10kgkg이 넘으면 1등급, 7kgkg이 넘으면 2등급, 4kgkg이 넘으면 3등급,
	//나머지는 4kg등급을 부여하는 checkGrade 메소드 만들기
	static int checkGrade(int weight) {
		if(weight > 10) {
			return 1;
		}else if (weight > 7) {
			return 2;
		}else if (weight > 4) {
			return 3;
		}else  {
			return 4;
		}
		return 4;
			}
    public static void main(String[] args) {
	
}
}
