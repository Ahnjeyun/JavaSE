package study06.exam;

//요소형이 double형이고 요소수가 5인 배열의 요소에 대해서 선두부터 순서대로 1.1, 2.2, 3.3, 4.4, 5.5을 대입해서 표시하는 프로그램의 예제

public class Exam02 {
	public static void main(String[] args) {
		double[] a = new double[5];
		a[0] = 1.1;
		a[1] = 2.2;
		a[2] = 3.3;
		a[3] = 4.4;
		a[4] = 5.5;
		
		for (int i = 0; i < a.length; i++) {
			double d = a[i];
			System.out.println(d);
		}
	}

}