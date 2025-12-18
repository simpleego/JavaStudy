package com.simple.loop;

import java.util.Scanner;

public class LoopJumsuChart {

	public static void main(String[] args) {
		// 점수에 해당하는 별점 표시
		// 점수에 별점을 10으로 나눠서 별점 출력
		
		Scanner kbd = new Scanner(System.in);
		
		int kor = 73;
		int starSize = kor/10;		
		System.out.print("국어 : ");	
		
		System.out.print("원하는 모양을 입력하세요 :");
		String shape = kbd.nextLine();		
		for (int i = 0; i < starSize; i++) {			
			System.out.print(shape);			
		}
		
		System.out.println();
		// 영어
		int eng = 89;
		starSize = eng/10;
		System.out.print("영어 : ");
		System.out.print("원하는 모양을 입력하세요 :");
		shape = kbd.nextLine();		
		
		for (int i = 0; i < starSize; i++) {			
			System.out.print(shape);			
		}		
		System.out.println();
		
		
		// 수학
		int mat=59;
		starSize = mat/10;
		System.out.print("수학 : ");	
		System.out.print("원하는 모양을 입력하세요 :");
		shape = kbd.nextLine();		
		
		for (int i = 0; i < starSize; i++) {			
			System.out.print(shape);			
		}

	}

}
