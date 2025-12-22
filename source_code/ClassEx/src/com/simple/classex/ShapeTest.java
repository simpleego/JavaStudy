package com.simple.classex;

public class ShapeTest {

	public static void main(String[] args) {
		// 원을 생성
		Circle c1;
		Rectangle r1;
		
		c1 = new Circle();
		
		c1.setCircle(5, 5, 8);
		c1.setName("동글이");
		
		r1 = new Rectangle();
		r1.height = 20;
		r1.width = 50;
		
		System.out.println(" 원의 이름 :"+c1);
		System.out.println(" 원의 면적 :"+c1.getArea());
		
		System.out.println(" 사각형 :"+r1);
		System.out.println(" 사각형의 면적 :"+r1.getArea());
	}

}
