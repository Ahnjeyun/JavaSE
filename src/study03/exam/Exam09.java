package study03.exam;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;       // 내림차순 추가

public class Exam09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a를 입력해주세요 : ");
		int a = stdIn.nextInt();
		System.out.println("정수 b를 입력해주세요 : ");
		int b = stdIn.nextInt();
		System.out.println("정수 c를 입력해주세요 : ");
		int c = stdIn.nextInt();
		
		
		int[] array = {a , b , c};
		
		Arrays.sort(array);   
		// 내림차순(최댓값이 위로)
	    //Arrays.sort(array, Collections.reverseOrder());
		// int가 아닌 interger로 변수선언 해야함
	
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("오름차순 정렬입니다." + array[i]);
		}
		

	
	}
}
