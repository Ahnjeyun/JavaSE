package day02.basic;

/*
 * 성적
 * result = 76 변수선언
 * 
 * 90점 이상이면 수
 * 90점 미만 80점 이상이면 우
 * 80점 미만 70점 이상이면 미
 * 70점 미만 60점 이상이면 양
 * 나머지 가
 * 
 * 성적 : 결과값 수,우,미,양,가 중 한개
 */
public class MainClass09 {
	public static void main(String[] args) {
	    /*	
	    int result = 56;
		
		if(result >= 90) {
			System.out.println("성적 : 수 ");
		} else if(result < 90 && 80 <= result) {
			System.out.println("성적 : 우 ");
		} else if(result < 80 && 70 <= result) {
			System.out.println("성적 : 미 ");
		} else if(result < 70 && 60 <= result) {
			System.out.println("성적 : 양 ");
		} else {
			System.out.println("성적 : 가 ");
		}
		*/
		
		int score = 70;
		String result = null;
		
		if(score >= 90) {
			result = "수";
		}else if(score >= 80) {
			result = "우";
		}else if(score >= 70) {
			result = "미";
		}else if(score >= 60) {
			result = "양";
		}else {
			result = "가";
		}
		System.out.println("성적 : " + result);
	}

}
