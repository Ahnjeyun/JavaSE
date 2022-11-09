package study09;

// 식별자의 유효범위를 확인하기

public class Scope {
	
	static int x = 700;  // 클래스 유효범위 : 필드

	static void printX() {
		System.out.println("x = " + x);
	}
	
	public static void main(String[] args) {
		System.out.println("x = " + x);
		
		int x = 800;     // 블록 유효범위 : 지역변수
		
		System.out.println("x = " + x);
		
		System.out.println("Scope.x = " + Scope.x);
		
		printX();
		
	}
	
}
