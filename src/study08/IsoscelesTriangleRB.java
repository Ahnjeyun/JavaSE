package study08;

import java.util.Scanner;

// 우하변이 직각인 직각삼각형을 표시

public class IsoscelesTriangleRB {

	//--- 문자 c를 n개 연속표시 ---//
	static void putChars(char c, int n) {
		while (n-- > 0)
			System.out.print(c);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("우하변이 직각인 직각삼각형을 표시합니다.");
		System.out.print("몇 단 : ");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			putChars(' ', n - i);  // ' '을 n - i개 표시
			putChars('+', i);      // '+'를 i개 표시
			System.out.println();
		}
	}
}
