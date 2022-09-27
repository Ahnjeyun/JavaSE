/*
package study04;
import java.util.Random;
import java.util.Scanner;

// 숫자 맞추기 게임(0~99의 값) do while문 사용

public class Kazuate {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100); // 맞춰야 할 수 : 0~99 사이에서 난수로 생성
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0~99 사이의 수를 맞혀주세요");
		
		int x;   // 플레이어가 입력한 수
		do {
			System.out.println("몇 일까요? : ");
			x = stdIn.nextInt();
			
			if (x > no)
				System.out.println("더 작은 수입니다.");
			else if (x < no)
				System.out.println("더 큰 수입니다");
		} while (x != no);   // 정답이 아니면 반복한다
		
		System.out.println("정답입니다.");
	}

}
*/