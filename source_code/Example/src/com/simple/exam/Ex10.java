package com.simple.exam;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 문자 판별하기
		// 문자를 입력받아 알파벳 대문자인지, 
		// 소문자인지, 숫자인지 판별하세요.
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("문자입력 : ");
		char ch = kbd.next().charAt(0);
		
//		if(ch >= '0' && ch <= '9') {
//			System.out.println("숫자입니다");
//		}
		if(Character.isDigit(ch)) {
			System.out.println("숫자입니다");
		}
		
//		if(ch >= 'a' && ch <= 'z') {
//			System.out.println("소문자입니다");
//		}
		
		if(Character.isLowerCase(ch)) {
			System.out.println("소문자입니다");
		}
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자입니다");
		}
		
		System.out.println("문자 :"+ch);	
		
	}

}
