package study04.exam;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("값을 입력해주세요 : ");
		int n = stdIn.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("\\");
			if (n < 1) {
				System.out.println(" ");
			}
		}
	
}	
}
