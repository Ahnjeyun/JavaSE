package day05.interfaceEx.mypac;


// 상속받는법은 implements 예약어로 선언한다.
public class AkWeapon implements Weapon{

	@Override
	public void attack() {
		System.out.println("지상 공격을 해요!");
		
	}

	@Override
	public void attackSky() {
		System.out.println("하늘 공격을 해요!");
		
	}
	
	public void autoAttack() {
		System.out.println("자동 연사를 해요!");
	}

}
