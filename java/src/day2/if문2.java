package day2;

public class if문2 {

	public static void main(String[] args) {
		/* 조건식이 참이면 실행문1을 실행하고, 조건식이 거짓이면 실행문2를 실행해라.
		 * 조건식이 참이면 실행문1을 실행하고, 아니면 실행문2를 실행해라.
		 * eles : else를 기준으로 위에 있는 조건식들이 거짓이면
		 * if(조건식){
		 * 실행문;
		 * }eles{
		 * 실행문2;
		 * }
		 * */
		int num = 1;
		/* num이 0과 같다면 0이라고 출력
		 * 아니면 0이 아니라고 출력*/
		if(num == 0) {
			System.out.println("0입니다.");
		}else {
			System.out.println(num + "는 0이 아닙니다.");
		}
		// num이 짝수이면 짝수라고 출력
		if((num % 2) == 0) {
			System.out.println(num + "는 짝수입니다.");
		}else {
			System.out.println(num + "는 홀수입니다.");
		}
		
		
		
		
		
	}

}
