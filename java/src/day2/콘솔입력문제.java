package day2;

import java.util.Scanner;

public class 콘솔입력문제 {

	public static void main(String[] args) {
		/* 정수와 문자와 정수를 입력받으세요.
		 * 예시
		 * 정수 문자 정수를 입력하세요 (예 1 + 2) : 1 + 2
		 * 입력받은 값 : 1 + 2
		 * */
		Scanner scan = new Scanner(System.in);
		int num;
		char ch;
		String str1;
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		str1 = scan.next();
		ch = scan.next().charAt(0);
		System.out.println("입력받은 값 : " + num +" " + str1 + " " + ch );
		System.out.printf("입력 받은 값 : %d %c %d\n", num, str1 + ch);
		scan.close();
	}

}
