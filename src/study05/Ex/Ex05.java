package study05.Ex;

/*     1
 *    222
 *   33333
 *  4444444
 * 555555555
 * 와같은 숫자피라미드 출력해보기   
 * 
 */

public class Ex05 {
	public static void main(String[] args) {
		int x = 1;
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < 9; j++) {
				
				if(i + j < 5) {
					System.out.print(" ");
				}else if(i - j < -3) {
					System.out.print(" ");
				}else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}

}
