package study03.exam;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 A의 값을 입력해주십시오 :  ");  int a = stdIn.nextInt();
		System.out.println("정수 B의 값을 입력해주십시오 :  ");  int b = stdIn.nextInt();
		
		int min = a - b;
		
		if (min >= 10)
			System.out.println("두 값의 차는 10이상입니다.");
		else if (min <= 10)
			System.out.println("두 값의 차는 10이하입니다.");
	}
}
