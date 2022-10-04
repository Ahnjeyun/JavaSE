package day06.exception;

public class MainClass06 {
	public static void main(String[] args) throws InterruptedException {
//		NumberPrinter p = new NumberPrinter();
//		p.PrintNumber();
		try {
			throw new InterruptedException();  // 강제 익셉션 발생시키기
		} catch(Exception e) {
			System.out.println("익셉션 발생");
		}
		
	}

}
