/*
package study07;

// 2행 3열인 행렬의 덧셈

public class Matrix {

	public static void main(String[] args) {
		int[][] a = { {1,2,3}, {4,5,6} };
		int[][] b = { {6,3,4}, {5,1,2} };
		int[][] c = { {0,0,0}, {0,0,0} };
		
		for (int i = 0; i < 2; i++) {    // a와 b의 합을 c에 대입
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("행렬 a"); // 행렬 a의 요소의 값을 표시
		for (int i =0; i < 2; i++) {
			for(int j =0; j<3; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("행렬 b"); // 행렬 b의 요소의 값을 표시
		for (int i =0; i < 2; i++) {
			for(int j =0; j<3; j++) {
				System.out.printf("%3d", b[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("행렬 c"); // 행렬 c의 요소의 값을 표시
		for (int i =0; i < 2; i++) {
			for(int j =0; j<3; j++) {
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		}
	}
}
*/