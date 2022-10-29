package study04.exam;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("월을 입력해주세요 : ");
		int mon = stdIn.nextInt();
		
		switch (mon) {
		case 1 : System.out.println("겨울입니다."); break;
		case 2 : System.out.println("겨울입니다."); break;
		case 3 : System.out.println("봄입니다."); break;
		case 4 : System.out.println("봄입니다."); break;
		case 5 : System.out.println("봄입니다."); break;
		case 6 : System.out.println("여름입니다."); break;
		case 7 : System.out.println("여름입니다."); break;
		case 8 : System.out.println("여름입니다."); break;
		case 9 : System.out.println("가을입니다."); break;
		case 10 : System.out.println("가을입니다."); break;
		case 11 : System.out.println("가을입니다."); break;
		case 12 : System.out.println("겨울입니다."); break;
		default : System.out.println("잘못입력하셨습니다"); break;
		}
	}
}
