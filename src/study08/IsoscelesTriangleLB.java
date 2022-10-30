package study08;

import java.util.Scanner;

// 좌하변이 직각인 직감삼각형을 표시

public class IsoscelesTriangleLB {

	//---문자 '*'을 n개 연속 표시 ---//
	static void putStars(int n) {
		while (n-- > 0)
			System.out.print('*');
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("좌하변이 직각인 직각삼각형을 표시합니다.");
		System.out.print("몇 단 : "); int n = stdIn.nextInt();
		
		for(int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}
}
