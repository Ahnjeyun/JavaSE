package study06;
import java.util.Scanner;

// 배열의 모든 요소에 값을 입력해서 표시

public class IntArrayScan {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요소 수 : ");
		int n = stdIn.nextInt();  // 요소 수를 입력
		int[] a = new int[n];     // 배열을 생성
		
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			
		}
	}
}
