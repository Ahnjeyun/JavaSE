package study03.exam;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a의 값을 입력해 주십시오 : ");   int a = stdIn.nextInt();
		System.out.println("정수 b의 값을 입력해 주십시오 : ");   int b = stdIn.nextInt();
		
		int min = a - b;
		
		System.out.println("두 값의 차는" + min + "입니다.");
	}
}
