package ch05;

public class mabangtt {
    public static void main(String[] args) {
	   int[][] mabang = new int [9][9];
	   
	   //��Ģ 1
	  
	   int row = 0;
	   int col = 9 / 2; 
	   
	    mabang[row][col] = 1;
	    
	   // 2~49 ���� �ݺ�
	   for(int i =2; i <= 9 * 9; i++) {
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
				   row = 9 - 1; // row = 5 + row
			   }
				   
			
		   
				   // ���� ������ ��  
		   }else {
			 
			   
			   //���� ������ �Ǿ�����
			  if(col < 0) {
				  col = 9 - 1;
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
	   for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();

		}
    }
}