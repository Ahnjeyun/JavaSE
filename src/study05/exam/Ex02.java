package study05.exam;

/*
2번

 *
***
*****
*******
*********

*/

public class Ex02 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {            // 열
			for(int j = 0; j < 9; j++) {         // 행
				if(i + j < 4) {
					System.out.print(" ");
				}else if(i - j < -4) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}