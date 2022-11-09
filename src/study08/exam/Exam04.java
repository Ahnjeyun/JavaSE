package study08.exam;

import java.util.Scanner;

// 계절 표시 메소드 printSeason을 작성

public class Exam04 {
	static void printSeason(int n) {
		if(n <= 2) {
			System.out.println("겨울입니다."); return;
		}else if (n <= 5) {
			System.out.println("봄입니다."); return;
		}else if (n <= 8) {
			System.out.println("여름입니다."); return;
		}else if (n <= 11) {
			System.out.println("가을입니다."); return;
		}else if (n == 12) {
			System.out.println("겨울입니다."); return;
		}else {
			System.out.println(); return;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("월을 입력해주십시오 : ");
		int m = stdIn.nextInt();
		printSeason(m);
		
	}

}
