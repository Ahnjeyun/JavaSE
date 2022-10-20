package study06;

import java.util.Random;
import java.util.Scanner;

// 배열 요소의 순서를 역순으로 바꿔서 표시

public class ReverseArray {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요소 수 : " );
		int n = stdIn.nextInt();       // 요소 수를 입력
		int[] a = new int[n];          // 배열을 선언
		
		for (int i = 0; i < n; i++) {
			a[i] = 10 + rand.nextInt(90);
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		for (int i = 0; i < n/2; i++) {
			int t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}
		
		System.out.println("요소의 나열을 반대로 바꾸었습니다.");
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
