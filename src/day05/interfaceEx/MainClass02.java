package day05.interfaceEx;

import day05.interfaceEx.mypac.HandPhone;
import day05.interfaceEx.mypac.Phone;
import day05.interfaceEx.mypac.SmartPhone;

/*
 * 객체 설계도 ->
 * class 클래스명 extends 부모클래스명 implements 부모인터페이스명(여러개 상속 가능)
 *   {
 *      
 *      생성자() - 객체가 생성될때 한번만 실행된다.
 *               멤버 필드 초기화용으로 자주 사용.
 *               리턴이 없다.
 *               오버로딩 가능
 *          
 *      변수(멤버필드) - 속성
 *      
 *      
 *      메소드(멤버메소드) - 기능, 오버로딩 가능
 *      
 *      오버라이딩 메소드 - 부모클래스의 메소드로 자식 클래스에서 재정의가 가능하다.
 *                      추가 정의하고 싶으면 super 예약어 사용으로 가능
 *                      인터페이스일경우 반드시 재정의(오버라이딩) 해줘야 한다. 
 * 
 *   }
 *   
 * [[ 다형성(polymorphism) ]]
 * 
 *    하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미.
 */

public class MainClass02 {
	public static void main(String[] args) {
		
		Phone p1 = new HandPhone();
		p1.call();
		p1.receive();
		
//	    HandPhone p2 = new HandPhone();
//	    p2.call();
//	    p2.receive();
//	    p2.sendMsg();
	    
	    HandPhone p2 = (HandPhone) p1;
	    
	    p2.sendMsg();
	    
	    HandPhone p3 = new HandPhone();
	    
	    System.out.println(System.identityHashCode(p1));
	    System.out.println(System.identityHashCode(p2));
	    System.out.println(System.identityHashCode(p3));
	    
	    Phone p4 = new SmartPhone();
		
	    classifyPhone(p1);
	    classifyPhone(p4);
	}
	
	public static void classifyPhone(Phone p) {
		if (p instanceof SmartPhone) {
			System.out.println("스마트폰 입니다");
		} else if (p instanceof HandPhone) {
			System.out.println("핸드폰 입니다");
		}
	}

}
