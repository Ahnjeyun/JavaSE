package study08.exam;

import java.util.Scanner;

// 1부터  n까지의 모든 정수의 합을 계산해서 반환하는 메소드를 작성하시오 int sumUp(int n)

public class Exam03 {
	static int sumUp(int n) {
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
	    
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 입력하신 정수까지의 합을 구해서 표시하는 프로그램입니다.");
		System.out.println("합을 구하실 정수 a의 값을 입력해주세요 : ");
		int a = stdIn.nextInt();
		
		System.out.println(a + "의 모든 합의 값은" + sumUp(a) + " 입니다");
	}

}
