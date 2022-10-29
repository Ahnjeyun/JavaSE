package study01.exam;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("삼각형의 면적을 구합니다");
		
		System.out.println("밑변 : ");
		double a = stdIn.nextDouble();
		
		System.out.println("높이 : ");
		double b = stdIn.nextDouble();
     	
		double c = a * b / 2;
		System.out.println("면적은" + c + "입니다.");
	}

}
