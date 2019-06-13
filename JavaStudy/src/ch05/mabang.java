package ch05;

public class mabang {
    public static void main(String[] args) {
	   int[][] mabang = new int [5][5];
	   
	   //규칙 1
	   mabang[0][2] = 1;
	   int row = 0;
	   int col = 2; 
	   
	   // 2~25 숫자 반복
	   for(int i =2; i <= 25; i++) {
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
				   row = 4; // row = 5 + row
			   }
				   
			
		   
				   // 행이 정상일 때  
		   }else {
			 
			   
			   //열이 음수가 되었을때
			  if(col < 0) {
				  col = 4;
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
	   for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();

		}
    }
}