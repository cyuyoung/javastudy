package CH04;

import java.util.Scanner;

public class ���������� {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while() {
		  //����:0, ����:1, ��:2
		 int �� = s.nextInt();
		
		 double ran = Math.random() * 3;//0.0~2.99999
		
		 int ���� = (int)ran;
		
		 if( (�� + 1) % 3 == ����) { // ���� ��
		 	 System.out.println("��");
		  } else {
		 	 if(�� == ����) { // ���
		 		 System.out.println("���");
		 	 } else { // ���� �̱�
		 		 System.out.println("�̱�");
				 b = false;
			 }
		 }
		} // end while
	}
}