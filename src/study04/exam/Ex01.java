package study04.exam;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int r = rand.nextInt(2 - 0 + 1) + 0;
		
		switch(r) {
		case 0: System.out.println("가위"); break;
		case 1: System.out.println("바위"); break;
		case 2: System.out.println("보"); break;
		}
		
	}
}
