package com.simple.exam;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		//최댓값 구하기 (세개의)
		// 두 정수를 입력받아 더 큰 수를 출력하세요.
		
		// 데이터 입력
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int max = 0;
		
		String result = "";
		Scanner kbd = new Scanner(System.in);

		System.out.print("숫자1 입력 : ");
		num1 = kbd.nextInt();
		
		System.out.print("숫자2 입력 : ");
		num2 = kbd.nextInt();
		
		System.out.print("숫자3 입력 : ");
		num3 = kbd.nextInt();

		// 데이처 처리
		// max = (num1 > num2) ? num1 : num2;
		
		max = num1;
		
		if(num2 > max) {
			max = num2;
		}
		
		if(num3 > max) {
			max = num3;
		}

		// 데이터 출력
		System.out.println("큰 수 :"+max);
		
	}

}
