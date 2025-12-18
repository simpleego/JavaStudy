package com.simple.exam;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// 짝수인지 3의 배수인지 판별하기
		// 정수를 입력받아 짝수인지, 3의 배수인지, 둘 다인지, 아무것도 아닌지 출력하세요.
		
		// 데이터 입력
		int num1 = 0;
		
		String result = "";
		Scanner kbd = new Scanner(System.in);

		System.out.print("숫자1 입력 : ");
		num1 = kbd.nextInt();
		
		if(num1 % 2 == 0 && num1 % 3 == 0) {
			result = "짝수이고 3의 배수";
		}
		
		if(num1 % 2 != 0 ) {
			result = "홀수이다.";
			if(num1 % 3 == 0) {		
				result = result + "3의 배수";
			}
		}

		
		// 데이터 출력
		System.out.println("결과:"+result);
		
	}

}
