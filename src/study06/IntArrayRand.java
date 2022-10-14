package study06;

import java.util.Random;
import java.util.Scanner;

// 배열의 모든 요소에 난수를 대입해서 가로 방향의 막대그래프로 표시

public class IntArrayRand {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = stdIn.nextInt();      // 요소 수를 입력
		int[] a = new int[n];         // 배열을 생성
		
		for (int i = 0; i < n; i++) {
			a[i] = 1 + rand.nextInt(10);    // 1 ~ 10의 난수
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] : " );
			for (int j = 0; j < a[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
