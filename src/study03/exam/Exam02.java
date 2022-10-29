package study03.exam;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a를 입력해주세요 :  ");    int a = stdIn.nextInt();
		System.out.println("정수 b를 입력해주세요 :  ");    int b = stdIn.nextInt();
		
		int min = a > b ? a : b;
		System.out.println("값이 더 큰수는 " + min + "입니다.");
		
	}
}
