package day04.constructor.mypac;

public class HandPhone {
	public String model;
	
	// 디폴트 생성자
	public HandPhone() {
		model = "갤럭시";
		System.out.println("디폴트 생성자가 호출되었습니다.");
	}
	
	// 오버로딩 생성자
	public HandPhone(String name) {
		model = name;
		System.out.println("생성자로" + name + "이 전달되었습니다");
	}

}
