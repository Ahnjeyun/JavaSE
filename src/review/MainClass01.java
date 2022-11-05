package review;

/*
 * 1. 객체란?
 *  
 *  실제로 존재 또는 추상적으로 식별가능한 모든것.
 *  최소한의 프로그램 단위.
 *  
 * 객체 설계도를 만든것 (a.k.a 붕어빵틀)
 * class 클래스명{
 * 
 * }
 * 
 * 객체를 만드는방법(객체생성) -> 메모리에 객체를 올린다. -> 인스턴스화
 * 클래스명(타입) 변수명 = new 클래스명();
 * 
 * 2. 객체 구성요소
 * 
 * 2-1 변수 - 특징, 속성 값
 *  2-1-1 타입    1) 기본형(8개) - boolean, byte, char, short, int, long, float, double, 
 *               2) 참조형 - 기본형 외 모든 변수 -> 객체주소값 가지고 있는 변수.
 *  2-1-2 선언위치 1) 전역변수 - 클래스에 종속, 멤버변수, 멤버필드
 *               2) 지역변수 - 메서드 안에 선언,
 *                           초기화 필수!! - 초기값 대입없을시 컴파일 에러 발생!! 사용불가!!
 *               3) 동적(default) - 일반 변수
 *                  정적(static)  - static이 선언된 변수 
 *                  
 * 2-2 메서드(method) - 기능
 *   2-2-1 메서드 구조
 *   접근제어자 (static) 리턴타입 메소드명(매개변수타입 매개변수명) {
 *       // 코드블럭 - 코드 작성영역
 *       
 *       return 리턴값;  // 리턴타입이 void면 생략 가능
 *   }
 *   
 *   2-2-2 접근제어자 4가지
 *       public - 모든 클래스에서 접근가능
 *       protected - 같은 패키지 또는 상속 관계에서 접근가능
 *       default(선언하지 않은 상태) - 같은 패키지에서 접근 가능
 *       private - 같은 클래스 내에서만 접근가능
 *       
 *   2-2-3 오버로딩 - 같은 메서드명 매개변수 선언만 다름. 오버라이딩이랑 헷갈리지 않기!!!!
 *   
 *   2-3 생성자(construtor) - 클래스 명과 같다. 객체가 생성될 때 한번만 실행된다.
 *                        - 멤버필드 초기화용으로 자주 사용.
 *                        - 메서드와 차이점은 리턴이 없다.
 *                        - 오버로딩이 가능하다.         
 *                       
 *   - 클래스 상속 - 부모클래스의 멤버를 자식클래스에서 사용 또는 재정의 가능.
 *      - 예약어 extends
 *      - super 예약어로 부모클래스 접근 가능
 *      - 부모 메서드 재정의 오버라이딩
 *   class 자식클래스명 extends 부모클래스명 {
 *   
 *   }
 *   
 *   - 인터페이스 상속 - 클래스 상속과 같지만 예약어가 implements 이다.
 *      - 추상메소드와 상수로만 구성되어 있다.
 *      - 여러개 상속이 가능하다.
 *      - 추상메소드는 반드시 오버라이딩 해줘야한다.   
 *    class 자식클래스명 extends 부모클래스명 {
 *      
 *   }                       
 *   
 *   - 다형성(polymorphism) - 하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미한다.
 *   
 *   - Collection - 배열성 데이터 다루는 객체 (util 패키지)
 *     - list
 *     - set
 *     - mat
 *   - io - InputStream OutputStream
 *   - Socket
 *   - JDBC - JAVA DBMS 연결 -> 프레임웍 변화 ibatis or mybatis
 *     
 */

public class MainClass01 {
	static int numGlobal;
	
	public static void main(String[] args) {
		
		int num = 0;
		String str = "";
		
		System.out.println(numGlobal);
		System.out.println(num);
		System.out.println(str);
		
		Test2 t2 = new Test2();
		
		t2.test(2);
		
		String str1 = "aaaa";
		
		String str2 = new String();
		str2 = "aaaa";
		
		String str3 = new String("aaaa");
	}

}