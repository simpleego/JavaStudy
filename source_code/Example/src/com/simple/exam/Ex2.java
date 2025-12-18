package com.simple.exam;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 양수/음수/0 판별하기
		// 정수를 입력받아 양수, 음수, 0 중 어떤 값인지 출력하세요.


		// 데이터 입력
		int num = 0;
		String result = "";
		Scanner kbd = new Scanner(System.in);

		System.out.print("숫자입력 : ");
		num = kbd.nextInt();

		// 데이터 처리		
//		if (num > 0) {
//			result = "양수";
//		}else if(num < 0 ) {
//			result = "음수";
//		}else {
//			result = "제로";
//		}
		
		if(num > 0) {
			result = "양수";
		}else {
			// 가능한 경우의 수
			if(num < 0) {
				result = "음수";
			}else {
				result = "제로";
			}
		}

		// 데이터 출력
		System.out.println("숫자:" + num);
		System.out.println("결과:" + result);
	}

}
