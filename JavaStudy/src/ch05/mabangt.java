package ch05;


public class mabangt {
    public static void main(String[] args) {
	   int[][] mabang = new int [7][7];
	   
	   //��Ģ 1
	  
	   int row = 0;
	   int col = 7 / 2; 
	   
	    mabang[row][col] = 1;
	    
	   // 2~49 ���� �ݺ�
	   for(int i =2; i <= 7 * 7; i++) {
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
				   row = 7 - 1; // row = 5 + row
			   }
				   
			
		   
				   // ���� ������ ��  
		   }else {
			 
			   
			   //���� ������ �Ǿ�����
			  if(col < 0) {
				  col = 7 - 1;
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
	   for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();

		}
    }
}