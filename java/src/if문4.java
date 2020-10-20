import java.util.Scanner;

public class if문4 {

	public static void main(String[] args) {
		/*이중 if문 : if문 안에 실행문으로 if문이 오는 경우
		 * if(조건식1){
		 * 		if(조건식2)
		 * 			실행문;
		 * 		}else{
		 * 			실행문;
		 * 		}
		 * }
		 * if(조선식1 && 조건식2){
		 * 		실행문1;
		 * else if(조건식1){
		 * 		실행문2;
		 * }
		 * */
		//정수를 입력받아 입력받음 정수가 6의 배수인지 출력하세요.
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		
		if(num % 2 ==0) {
			if(num % 3 == 0) {
				System.out.println(num+"는 6의 배수");
			}else {
				System.out.println(num+"는 6의 배수가 아님");
			}
		
		scan.close();

	
	
	
	
	}

}
}
