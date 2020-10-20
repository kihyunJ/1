package day2;

import java.util.Scanner;

public class if문3 {

	public static void main(String[] args) {
		/* 조건식1이 참이면 실행문 1을 실행하고
		 * (조건식1이 거짓이고) 조건식2가 참이면 실행문2를 실행하고
		 * (조건식1과 조건식2가 거짓이면) 실행문 3을 실행해라
		 * if (조건식1){
		 * 		실행문1;
		 * }else if(조건식2) {
		 * 		실행문2;
		 * }else{
		 * 		실행문3;
		 * }
		 *정수를 입력받아 입력받은 정수가 양수이면 양수라고 출력하고
		 *0이면 0이라고 출력하고 음수이면 음수라고 출력하세요.
		 * */
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		if(num > 0) {
			System.out.println("양수입니다.");
		}else if(num == 0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		/* (정수)성적을 입력받아 입력받은 성적에 맞는 학점을 출력하세요.
		 * 90 - 100 : A
		 * 80 - 89  : B
		 * 70 - 79  : C
		 * 60 - 69  : D
		 * 0  - 59  : F
		 * 0미만, 100초과 : 잘못된 성적
		 * */
		int num2;
		System.out.print("점수를 입력하세요 : ");
		num2 = scan.nextInt();
		if(num2 >= 90 && num2 <= 100) {
			System.out.println("A입니다.");
		}else if(num2 >= 80 && num2 <= 89) {
			System.out.println("B입니다.");
		}else if(num2 >= 70 && num2 <= 79) {
			System.out.println("C입니다.");
		}else if(num2 >= 60 && num2 <= 69) {
			System.out.println("D입니다.");
		}else if(num2 >= 0 && num2 <= 59) {
			System.out.println("F입니다.");
		}else {
			System.out.println("잘못된 성적입니다.");
		}
		
		if(num2 > 100|| num < 0) {
			System.out.println("잘못된 성적");
		}else if(num2 >= 90) {
			System.out.println("A입니다.");
		}else if(num2 >= 80) {
			System.out.println("B입니다.");
		}else if(num2 >= 70) {
			System.out.println("C입니다.");
		}else if(num2 >= 60) {
			System.out.println("D입니다.");
		}else {
			System.out.println("F입니다.");
		}
		scan.close();
		
	}

}
