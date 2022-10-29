package study03.exam;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a : ");   int a = stdIn.nextInt();
		System.out.println("정수 b : ");   int b = stdIn.nextInt();
		System.out.println("정수 c : ");   int c = stdIn.nextInt();

		int mim = a;
		if (mim > b) mim = b;          // 값이 적을 경우 대입되서 내려옴
		if (mim > c) mim = c;          
		
		System.out.println("최솟값은 " + mim + "입니다.");

		
	}
}
