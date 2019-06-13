package CH04;
public class Star1 {
	public static void main(String[] args) {
		/*  주석 (여러줄)
		    *
		    **
		    ***
		    ****
		    *****
		 */
		print(3, "Q");
		print(7, "#");
		
	}
	

	static void print(int count, String s ) { //string 은 큰 따옴표
	for(int i = 1; i <= count; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
}
	



