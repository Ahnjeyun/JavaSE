package study06.exam;

import java.util.Scanner;

//시험 점수의 합계, 평균, 최고 점수, 최저 점수를 표시하는 프로그램을 작성하시오, 사람 수와 점수는 키보드로 입력할것

public class Ex04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("사람 수를 입력해주세요 : ");
		int per = stdIn.nextInt();
		int[] per2 = new int[per];
		
		int sum = 0;
		
		System.out.println(per + "명의 점수를 입력해주세요");
		
		for(int i = 0; i < per; i++) {
			System.out.println((i + 1) + "번째 점수 : ");
			per2[i] = stdIn.nextInt();
			sum += per2[i];
		}
		
		int max = per2[0];
		for(int i = 1; i < per2.length; i++) {
			if (per2[i] > max) max = per2[i];
		}
		
		System.out.println("최고 점수는 " + max + "점입니다");
		
		int low = per2[0];
		for(int i = 1; i <per2.length; i++) {
			if (per2[i] < low) low = per2[i];
		}
		
		System.out.println("최저 점수는 " + low + "점입니다");
		
		
		double avg = sum / per2.length;
		System.out.println("평균 점수는" + avg + "입니다");
		
	}

}
