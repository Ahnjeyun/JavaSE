package study03.exam;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a를 입력해주세요 : ");
		int a = stdIn.nextInt();
	
		System.out.println("정수 b를 입력해주세요 : ");
		int b = stdIn.nextInt();
		
		int min = a;
		int max = b;
		
		if (a > b)
		{
			max = a;
			min = b;
		}
		else if (a < b)
		{
			max = b;
			min = a;
		}
		else
		{
			System.out.println("두값의 크기는 같습니다.");
		}
		
		System.out.println("값이 더 큰 쪽은 " + max + "입니다.");
		System.out.println("값이 더 작은 쪽은 " + min + "입니다.");
	}
}