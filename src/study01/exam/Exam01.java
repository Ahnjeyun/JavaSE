package study01.exam;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값 :");
		int a = stdIn.nextInt();
		
		int b = a + 10;
		System.out.println("10을 더한 값은" + b + "입니다");
		
		int c = a - 10;
		System.out.println("10을 뺀 값은" + c + "입니다");
	}
}
