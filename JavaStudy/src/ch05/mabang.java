package ch05;

public class mabang {
    public static void main(String[] args) {
	   int[][] mabang = new int [5][5];
	   
	   //��Ģ 1
	   mabang[0][2] = 1;
	   int row = 0;
	   int col = 2; 
	   
	   // 2~25 ���� �ݺ�
	   for(int i =2; i <= 25; i++) {
		   row = row - 1; // 1�� ����
		   col = col - 1; // 1�� ����
		   
		   // ���� ������ �Ǿ��� ��
		   if(row < 0) {
			// ���� ������ �Ǿ����� 15�� �밢�� ���� ���
			   if(col < 0) {
				   row = row + 2;
				   col = col + 1;
				   // ���� �����϶�
			   } else {
				   row = 4; // row = 5 + row
			   }
				   
			
		   
				   // ���� ������ ��  
		   }else {
			 
			   
			   //���� ������ �Ǿ�����
			  if(col < 0) {
				  col = 4;
		      //���� �����϶�
			  }else {
				  if(mabang[row][col] > 0) {
					  row = row + 2;
					  col = col + 1;
				  }
			  }
		   }
			   
		   mabang[row][col] = i;
} // end for
	   for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();

		}
    }
}