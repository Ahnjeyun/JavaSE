package study01.exam;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("실수 x의 값을 입력해주세요 : ");
	double x = stdIn.nextDouble();
	
	System.out.println("실수 y의 값을 입력해주세요 : ");
	double y = stdIn.nextDouble();
	
	double a = x + y;
	System.out.println("x와 y의 합계는" + a + "입니다");
	
	double b = a /2;
	System.out.println("x와 y의 평균은" + b + "입니다");
	
}

}
