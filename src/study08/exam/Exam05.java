package study08.exam;

import java.util.Random;
import java.util.Scanner;

// a 이상 b 미만의 난수를 생성해서 그 값을 반환하는 메소드 random을 작성하시오. 내부에서 난수를 생성하는 표준 라이브러리를 호출할 것.

public class Exam05 {

	static int random(int a,int b) {
		Random r = new Random();
		
		if (b < a) 
			return a;
		
		b = (int)(Math.random() * (b - a) + a);       // (int) (Math.random() * 최대값 - 최소값+1) + 최소값
		return b;                                     // b미만이라 +1 뺌
		                                              // nextInt(최대값) + 증감값(계산잘해야함)도 가능 
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a와 b사이의 무작위 난수를 생성하는 프로그램입니다.");
		System.out.println("최소 값 a를 입력해주세요 : "); int a = stdIn.nextInt(); 
		System.out.println("최댓 값 b를 입력해주세요 : "); int b = stdIn.nextInt();
		
		System.out.println(random(a, b));
	}
}
