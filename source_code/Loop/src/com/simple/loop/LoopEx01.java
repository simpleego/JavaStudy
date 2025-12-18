package com.simple.loop;

public class LoopEx01 {

	public static void main(String[] args) {
		// 1~10까지 짝수의 합을 구하시오.
		// 1~10까지 홀수의 합을 구하시오.

		// for
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 1; i <= 10; i++) {
			
			// 짝수의 합
			if (i % 2 == 0) {
				evenSum += i;
				System.out.print(i + ", ");
			}else {
				oddSum += i;
				System.out.print(i + ", ");
			}			
			
		}
		
		System.out.println();
		System.out.println("짝수 합:"+evenSum);
		System.out.println("홀수 합:"+oddSum);

	}

}
