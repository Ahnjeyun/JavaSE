package study05.exam;

	/*
	for 반복문 연습
	 
	 [주말과제 !!]
	 1번
	      *
	     **
	    ***  
	   ****
	  *****
	 ******
	******* 

	*/

	public class Ex01 {
		public static void main(String[] args) {
			
			for(int i = 0; i < 7; i++) {
				for(int j = 0; j < 7; j++) {
					if(i + j < 6) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
		}

	}


