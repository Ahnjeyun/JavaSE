package study08.exam;

import java.util.Scanner;

// 세 int형 a,b,c의 중앙값을 구하는 메소드 med을 작성하시오

public class Exam02 {

	static int med(int a, int b, int c) {
		if(a>=b) {
			if(a<=c) {
				return a;
			}else if (b>=c) {
				return b;
			}else {
				return c;
			}
		}else if(a>=c) {
			return a;
		}else if(b<=c) {
			return b;
		}else return c;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("입력받은 정수 3개의 중간값을 구하는 프로그램입니다.");
		System.out.println("정수 a를입력해주세요 : ");
		int a = stdIn.nextInt();
		System.out.println("정수 b를입력해주세요 : ");
		int b = stdIn.nextInt();
		System.out.println("정수 c를입력해주세요 : ");
		int c = stdIn.nextInt();
		
		int result = med(a,b,c);
		
		System.out.println("중갑값은 " + result + " 입니다.");
	}
}
