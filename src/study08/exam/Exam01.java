package study08.exam;

import java.util.Scanner;

// 건내진 int 형의 값이 음이면 -1을 반환하고, 0이면 0을 반환하고, 양이면 1을 반환하는 메소드 signOf를 작성하시오

public class Exam01 {

	static int signOf(int n) {
		if (n < 0) {
			return -1;
		}else if(n == 0) {
			return 0;
		}else return 1;
		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("값을 입력해주세요 : ");
		int a = stdIn.nextInt();
		int b = signOf(a);
		
		System.out.println("반환된 값은 " + b + " 입니다");
	}

}
