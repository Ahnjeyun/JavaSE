package study07.ex;
/*
package study07.Ex;

import java.util.Random;
import java.util.Scanner;
// 월을 1~12의 수치로 표시한 후 영어단어를 입력시키는 영어단어 학습프로그램을 작성하시오.

public class Ex01 {
	public static void gameStart() {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		final String[] monthString = {
				"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"
		        };
		System.out.println("월을 영어단어로 입력해 주십시오.");
		System.out.println("또한 처음 문자는 대문자로, 2번째 문자 이후는 소문자로 합니다.");
		
		int month = rand.nextInt(12);
		
		System.out.println((month + 1) + "월 : ");
		String str = stdIn.next();
		String str2 = "";
		
		while (true) {
			if(month == 1) {
			str2 = monthString[month];
			  if(str2.equals(str))
					break;
			  else
				  System.out.println("아닙니다."); return;
			}if(month == 2) {
				str2 = monthString[month ];
				  if(str2.equals(str))
						break;
				  else
					  System.out.println("아닙니다."); return;
				}if(month == 3) {
					str2 = monthString[month];
					  if(str2.equals(str))
							break;
					  else
						  System.out.println("아닙니다."); return;
			}if(month == 4) {
				str2 = monthString[month];
				  if(str2.equals(str))
						break;
				  else
					  System.out.println("아닙니다."); return;
			}if(month == 5) {
				str2 = monthString[month];
				  if(str2.equals(str))
						break;
				  else
					  System.out.println("아닙니다."); return;
			}if(month == 6) {
				str2 = monthString[month];
				  if(str2.equals(str))
						break;
				  else
					  System.out.println("아닙니다."); return;
			}if(month == 7) {
				str2 = monthString[month];
				  if(str2.equals(str))
						break;
				  else
					  System.out.println("아닙니다."); return;
			}if(month == 8) {
				str2 = monthString[month];
				  if(str2.equals(str))
						break;
				  else
					  System.out.println("아닙니다."); return;
			}if(month == 9) {
				str2 = monthString[month];
				  if(str2.equals(str))
						break;
				  else
					  System.out.println("아닙니다."); return;
			}if(month == 10) {
				str2 = monthString[month];
				  if(str2.equals(str))
						break;
				  else
					  System.out.println("아닙니다."); return;
			}if(month == 11) {
				str2 = monthString[month];
				  if(str2.equals(str))
						break;
				  else
					  System.out.println("아닙니다."); return;
			}if(month == 12) {
				str2 = monthString[month];
				  if(str2.equals(str))
						break;
				  else
					  System.out.println("아닙니다."); return;
			}
				
			
		}
		System.out.println("정답입니다. 다시 한번 하겠습니까 1...Yes / 0...No : ");
		int re = stdIn.nextInt();
		while(true) {
			if (re == 0) {
			  return;
			}
			else if (re == 1) {
				gameStart();
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		
	}
	public static void main(String[] args) {
		gameStart();
	}
}
*/
