package day2;

public class IF문1 {

	public static void main(String[] args) {
		/*조건식이 참이면 실행문을 실행해라.
		 * if(조건식){
		 * 실행문;
		 * }
		 * ~면 ...한다
		 * ~ : 조건식
		 * ...: 실행문
		 * num이 0이면 0이라고 출력
		 * 조건식 : num이 0이다
		 * 실행문 : 0이라고 출력
		 */ 
		int num = -1;
		if(num == 0) {
			System.out.println("num은 0입니다.");
		}
		/* 
		num이 0이 아니면 0이 아니라고 출력
		 조건식 : num이 0이 아니다.
		 실행문 : 0이 아니라고 출력
		 */
		if(num != 0) {
		System.out.println("num은 0이 아닙니다.");	
		}
		/*num이 양수이면 양수라고 출력 (양수는 0보다 큰 수)
		 *num이 음수이면 음수라고 출력*/
		if(num > 0) {
			System.out.println("num은 양수입니다.");
		}
		if(num < 0) {
			System.out.println("num은 음수입니다.");
		}
		
	}
}
