package day04.method.mypac;

public class Car {
	// 엔진이 시동이 걸렸는지 저장하는 멤버필드
	public boolean isEnginestarted = false;
	// 팟홀표기법 is_engine_started
    
	// 멤버 메소드
    public void drive() {
    	if(isEnginestarted) {
    		System.out.println("차가 움직여요!");
    	}else {
    		System.out.println("엔진이 꺼져 있어서 움직일 수 없어요!");
    	}
    }
    
	// 엔진을 정지 시키는 메소드
    public void stopEngine() {
    	isEnginestarted = false;
    	System.out.println("엔진이 꺼졌습니다.");
    }
    
    // 엔진을 다시 켜는 메소드
    public void startEngine() {
    	isEnginestarted = true;
    	System.out.println("엔진이 켜졌습니다.");
    }
    
    public boolean getIsisEnginestarted() {
    	return isEnginestarted;
    }
    
    public int sum(int a, int b) {
    	int resultNum = a + b;
    	return resultNum;
    }
    
}
