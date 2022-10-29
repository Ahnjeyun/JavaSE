/*
package study07;

// 월을 나타내는 영어단어의 학습 프로그램

import java.util.Random;
import java.util.Scanner;

public class MonthCAI {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {
				"January", "Febuary", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"
		        };
		
		int month = rand.nextInt(12); // 맞혀야 할 월 : 0~11의 난수
		System.out.println("문제는 " + monthString[month]);
		
		while(true) {
			System.out.println("몇 월입니까? : ");
			int m = stdIn.nextInt();
			
			if (m == month + 1) break;
			System.out.println("아닙니다.");
		}
		System.out.println("정답입니다.");
		
		}
	}

*/
