package study08;

import java.util.Scanner;

// 직사각형과 정사각형을 표시

public class SquareRectangle {

	//--- 문자 c를 n개 연속표시 ---//
	static void putChars(char c, int n) {
		while (n-- > 0)
			System.out.print(c);
	}
	
	//--- 문자 '+'를 나열해서 한 변의 길이가 n인 정사각형을 표시 ---//
	static void putSquare(int n) {
		for (int i = 1; i <= n; i++) {  // 아래의 처리를 n회 실행
			putChars('+', n);           // 문자 '+'를 n개 표시
			System.out.println();       // 줄 바꿈
		}
	}
	
	//--- 문자 '*'를 나열해서 높이 h이고 폭 w인 직사각형을 표시 ---//
	static void putRectangle(int h, int w) {
		for (int i = 1; i<= h; i++) {   // 아래의 처리를 h회 실행
			putChars('*', w);           // 문자 '*'를 w회 실행
			System.out.println();       // 줄 바꿈
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정사각형을 표시합니다.");
		System.out.print("한 변은 : "); int n = stdIn.nextInt();
		putSquare(n);      // 정사각형을 표시
		
		System.out.println("직사각형을 표시합니다.");
		System.out.print("세로는 : "); int h = stdIn.nextInt();
		System.out.print("가로는 : "); int w = stdIn.nextInt();
		putRectangle(h, w);// 직사각형을 표시
		
	}
}
