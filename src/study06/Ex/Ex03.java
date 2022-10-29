package study06.Ex;

import java.util.Scanner;

// 요소 수를 입력하고 각 요소의 값을 입력하면 a = {5,6,7} 과 같이 표시해주는 프로그램의 예제
public class Ex03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요소 수를 입력해주세요 : ");
		int num = stdIn.nextInt();
		int[] num2 = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "번째 요소 수의 값을 입력해주세요 : ");
			num2[i] = stdIn.nextInt();
		}
		System.out.print("a = {");
		for (int i = 0; i < num2.length; i++) {
				System.out.print(num2[i] + ", ");
		}
		System.out.println("}");
	}
}
