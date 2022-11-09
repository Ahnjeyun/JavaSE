package study09;

import java.util.Random;
import java.util.Scanner;

// 암산 연습

public class MentalArithmetic {

	static Scanner stdIn = new Scanner(System.in);
	
	//--- 지속 여부의 확인 ---//
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("다시 한번? <yes-1/No-0> : ");
			cont = stdIn.nextInt();
		} while (cont != 0 && cont != 1); {
			return cont == 1;
		}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("암산 트레이닝!!");
		do {
			int x = rand.nextInt(900) + 100;   // 3자릿수의 수
			int y = rand.nextInt(900) + 100;   // 3자릿수의 수
			int z = rand.nextInt(900) + 100;   // 3자릿수의 수
			
			while(true) {
				System.out.print(x + " + " + y + " + " + z + " = ");
				int k = stdIn.nextInt();   // 입력한 값
				if (k == x + y + z)
					break;
				System.out.println("틀렸습니다!!");
			}
		}
		while(confirmRetry());
	}
}
