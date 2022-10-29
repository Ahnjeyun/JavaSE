package study02.exam;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫 값 : ");
		int n = stdIn.nextInt();
		
		if (n > 0)
			System.out.println("절댓값은" + n + "입니다");
		else
			System.out.println("절댓값은" + Math.abs(n) + "입니다");
		
	}
}
