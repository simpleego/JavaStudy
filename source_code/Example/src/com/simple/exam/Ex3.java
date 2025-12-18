package com.simple.exam;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// 나이 판별하기
		// 나이를 입력받아 성인(20세 이상)인지 미성년자인지 출력하세요.

		// 데이터 입력
		int age = 0;
		String result = "";
		Scanner kbd = new Scanner(System.in);

		System.out.print("나이입력 : ");
		age = kbd.nextInt();

		// 데이처 처리
		if (age >= 20) {
			result = "성년";
		} else {
			result = "미성년";
		}

		// 데이터 출력
		System.out.println("나이:" + age);
		System.out.println("결과:" + result);
	}

}
