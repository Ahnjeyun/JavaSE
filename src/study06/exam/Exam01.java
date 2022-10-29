package study06.exam;

import java.util.Scanner;

//양의 정숫값으로 입력하면 그 값이 소수인지 아닌지를 판정하는 프로그램의 예제


public class Exam01 {
		public static void main(String[] args) {
		 
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("정숫값을 입력해주세요 : ");
			int a = stdIn.nextInt();
			
			for(int i = 2; i <= a; i++ ) {
				if(a == 2) {
					System.out.println("소수입니다."); break;
				}else if (a % i ==0) {
					System.out.println("소수가 아닙니다."); break;
				}else {
					System.out.println("소수입니다."); break;
				}
			}
		}
	}	