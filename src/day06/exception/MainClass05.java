package day06.exception;

/*
 *  throws 된 EXception 처리
 *  
 *  
 */

public class MainClass05 {
	public static void main(String[] args) {
		NumberPrinter p = new NumberPrinter();
		
		try {
			p.PrintNumber();
		} catch (InterruptedException e) {
			System.out.println("익셉션 발생");
			e.printStackTrace();
		}
	}

}
