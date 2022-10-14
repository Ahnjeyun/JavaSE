package study06;

import java.util.Scanner;

// 점수를 입력하면 합계와 평균을 표시

public class PointSumAveArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;                         // 합계
		final int person = 5;                // 사람수
		int[] point = new int[person];       // 점수
		
		System.out.println(person + "명의 점수를 입력하시오.");
		for (int i = 0; i < person; i++) {
			System.out.println((i + 1) + "번의 점수 : ");
			point[i] = stdIn.nextInt();   // point[i]를 입력해서
			sum += point[i];              // sum에 point[i]를 더한다
		}
		
		System.out.println("합계는 " + sum + "점입니다");
		System.out.println("평균은 " + (double)sum / person + "점입니다");
		
	}
}
