package day2;

import java.util.Scanner;

public class 콘솔입력 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		System.out.println("입력받은 값 : " + num);
		
		double mun2;
		System.out.print("실수를 입력하세요 : ");
		mun2= scan.nextDouble();
		System.out.println("입력받은 값 : " + mun2);
		
		//뮨자열의 양쪽 끝에 있는 공백을 제외한 문자열을 가져옴
		String str1;
		System.out.print("문자열을 입력하세요 : ");
		str1 = scan.next();
		System.out.println("입력받은 값 : " + str1);
		
		String str2;
		System.out.print("문자열을 입력하세요 : ");
		str2 = scan.nextLine();
		System.out.println("입력받은 값 : " + str2);
		
		char ch;
		System.out.print("문자를 입력하세요 : ");
		ch = scan.next().charAt(0);
		System.out.println("입력받은 값 : " + ch);
		

		scan.close();
	}

}
