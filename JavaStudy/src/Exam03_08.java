public class Exam03_08 {
	public static void main(String[] args) {
		int num = 10;
		
		// ��� �Ǵ� ���� �ΰ��� ��츸 �Ǵ�
		String a = (num >= 0) ? "���" : "����";
		
		System.out.println( 
				(num >= 0) ? "���" : "����"  ); // ���� ������
		
		// ���, ����, 0 3���� ���� �Ǵ�
		String result = 
			(num > 0) ? "���" :
				(num == 0) ? "0" : "����";