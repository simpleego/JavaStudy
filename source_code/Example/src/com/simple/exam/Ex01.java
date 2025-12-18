package com.simple.exam;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 짝수/홀수 판별하기
		// 사용자로부터 정수를 입력받아 짝수인지 홀수인지 출력하세요.

		// 데이터 입력
		int num = 0;
		String result = "";
		Scanner kbd = new Scanner(System.in);

		System.out.print("숫자입력 : ");
		num = kbd.nextInt();

		// 데이터 처리
		int num_ = num % 2;
		
		if (num_ == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}

		// 데이터 출력
		System.out.println("숫자:" + (num+1));
		System.out.println("결과:" + result);
	}

}
