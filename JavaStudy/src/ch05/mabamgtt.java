package ch05;

public class mabangtt {
    public static void main(String[] args) {
	   int[][] mabang = new int [9][9];
	   
	   //규칙 1
	  
	   int row = 0;
	   int col = 9 / 2; 
	   
	    mabang[row][col] = 1;
	    
	   // 2~49 숫자 반복
	   for(int i =2; i <= 9 * 9; i++) {
		   row = row - 1; // 1행 감소
		   col = col - 1; // 1열 감소
		   
		   // 행이 음수가 되었을 때
		   if(row < 0) {
			// 열도 음수가 되었을때 15의 대각선 위의 경우
			   if(col < 0) {
				   row = row + 2;
				   col = col + 1;
				   // 열은 정상일때
			   } else {
				   row = 9 - 1; // row = 5 + row
			   }
				   
			
		   
				   // 행이 정상일 때  
		   }else {
			 
			   
			   //열이 음수가 되었을때
			  if(col < 0) {
				  col = 9 - 1;
		      //열이 정상일때
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