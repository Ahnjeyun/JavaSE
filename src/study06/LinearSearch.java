package study06;

import java.util.Random;
import java.util.Scanner;

// 선형탐색
public class LinearSearch {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int n = 12;      // 요소 수
		int[] a = new int[n];  // 배열을 선언
		
		for (int j = 0; j < n; j++) {
			a[j] = rand.nextInt(10);
		}
		
		System.out.print("배열 a의 모든 요소의 값\n{ ");
		for (int j = 0; j < n; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("}");
		
		System.out.print("탐색할 수치 : ");
		int key = stdIn.nextInt();
		
		int i;
		for (i = 0; i < n; i++) {
			if(a[i] == key)
				break;
		}
		
		if (i < n)                      // 탐색 성공
			System.out.println("이것은 a [" + i + "]에 있습니다.");
		else                            // 탐색 실패
			System.out.println("이것은 없습니다");
	}
}
