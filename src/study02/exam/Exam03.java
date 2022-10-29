package study02.exam;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a의 값을 입력해주세요 : ");
		int a = stdIn.nextInt();
		System.out.println("b의 값을 입력해주세요 : ");
		int b = stdIn.nextInt();
		System.out.println("c의 값을 입력해주세요 : ");
		int c = stdIn.nextInt();
		
		if(a > b && a > c)
			System.out.println("a가 가장 큽니다.");
		else if (b > a && b > c)
			System.out.println("b가 가장 큽니다.");
		else if (c > a && c > b)
			System.out.println("c가 가장 큽니다.");
		else
			System.out.println("a,b,c의 값이 동일합니다.");
		
	}
}
