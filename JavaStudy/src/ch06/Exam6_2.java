package ch06;

public class Exam6_2 {
	
/*  ���ǿ� �ش��ϴ� dilemma �޼ҵ� �����
	 ���� ) ������ A, B�� ü���Ǿ� ���� �ٸ� �����ǿ��� �ݸ��Ǿ� �ɹ��� �ް� ����
	 �� ���� �ڹ� ���ο� ���� ���� �Ǵ� �����Ⱓ�� ������
	���� 1) �� �� �ϳ��� ����Ͽ� �˸� �ڹ��ϸ� �ڹ��� ����� ��� ����ǰ� �������� 10kg���� ����
	 ���� 2) �� ��� ���� ����Ͽ� �˸� �ڹ��ϸ� �� �� 5���� ����
	 ���� 3) �� ��� �˸� �ڹ����� ������ �� �� 1���� ����
	 ���� 4kg) �����ڸ� ��Ÿ���� ���� xa, xb�� �ڹ��ϸ� true, �׷��� ������ false�� ����*/

   public static void main(String[] args) {
	

}

	}
	











	// 1 / 3 / 5 / 7 / 8 / 10 / 12���� 31��, 4k/ 6 / 9 / 11���� 30��, 2���� 28�ϱ��� ����
	//Ư�� ���� �Է��ϸ� �ش��ϴ� ���� ��¥ ���� ��ȯ�ϴ� getLastYear �޼ҵ� �����
	
	static int getLastYear(int month) {
		// 
		int[] months = 
		
		// || or && <=== short circuit evaluation
	}
	
	
	
	
	
	
	
	
	
	//�� ���� ���� a, b�� �ԷµǾ��� �� a �� b ���̿� ���� ��� ������ ���� ��ȯ�ϴ�
	//getBetweenSum �޼ҵ� �����
    static int getBetweenSum(int a, int b) {
    	
    	//a = (a > b) ? a : b;
    	if(a > b) {
    		
    	}
    	int total = 0;
    	
    	for(int start = a; start <= b; start++) {
    		total = total + start; 
    	}
    }
	
	
	
	
	
	
	
	
	
	
	
	//������ ���԰� 10kgkg�� ������ 1���, 7kgkg�� ������ 2���, 4kgkg�� ������ 3���,
	//�������� 4kg����� �ο��ϴ� checkGrade �޼ҵ� �����
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
