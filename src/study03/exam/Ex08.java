package study03.exam;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a의 값을 입력해주세요 : ");
		int a = stdIn.nextInt();
		System.out.println("정수 b의 값을 입력해주세요 : ");
		int b = stdIn.nextInt();
		
		if(a < b)
		{
			int t = b;
			b = a;
			a = t;
		}

		System.out.println("변수 a는 " + a + "입니다.");
		System.out.println("변수 b는 " + b + "입니다.");
	}
}
