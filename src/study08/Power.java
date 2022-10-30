package study08;

import java.util.Scanner;

// 거듭제곱 계산하기

public class Power {
	static double powerrr(double x, int n) {
		double tmpp = 1.0;
		
		while (n-- > 0)
			tmpp *= x;    //tmpp 에 x를곱한다
		return tmpp;
	}

	//--- x의 n승을 반환 ---//
	static double powerr(double x, int n) {
		double tmp = 1.0;
		
		for (int i = 1; i <= n; i++) {
			tmp *= x; // tmp에 x를 곱한다
		}
		return tmp;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a의 b승을 계산합니다.");
		System.out.print("실수 a : "); double a = stdIn.nextDouble();
		System.out.print("정수 b : "); int b = stdIn.nextInt();
		
		System.out.println(a + "의 " + b + "승은 " + powerr(a, b) + "입니다");
	}
}
