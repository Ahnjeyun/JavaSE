package study03.exam;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("점수를 입력하여 주십시오 : ");
		int test = stdIn.nextInt();
		
		if(test >= 0 && test <= 59)
			System.out.println("낙제입니다.");
		else if (test >= 60 && test <= 69)
			System.out.println("보통입니다.");
		else if (test >= 70 && test <= 79)
			System.out.println("양호입니다.");
		else if (test >= 80 && test <= 100)
			System.out.println("우수입니다.");
	
	}
}
