package review;

public class Test2 {
	public Test2() {
		System.out.println("생성자입니다.");
	}

	public void test2() {
		System.out.println("protected 테스트중입니다.");
	}
	// 오버로딩
	public void test(String name) {
		System.out.println("이름 :" + name);
	}
	
	// 오버로딩
	public void test(int num) {
		System.out.println("숫자 :" + num);
	}
	

}
