package study06;

public class AssignArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 5, 4, 3, 2, 1, 0};
		
		System.out.print("a = ");        // 배열 a의 모든 요소를 표시
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		} 
		System.out.println();       
		
		System.out.print("b = ");        // 배열 b의 모든 요소를 표시
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		b = a;       // 배열 a를 b에 복사(?)
		
		a[0] = 10;   // 배열 a[0]의 값을 변경
		
		System.out.println("a를 b에 대입했습니다.");
		System.out.print("a = ");         // 배열 a의 모든 요소를 표시
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.print("b = ");         // 배열 b의 모든 요소를 표시
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
	}
}
