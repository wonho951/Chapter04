package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 6);
		Point p03 = new Point(5, 10);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		/*
		for(Point p : pSet) {
			System.out.println(p.toString());
		}
		*/
		
		System.out.println(pSet.toString());	// 개발용으로 빨리 보고 싶을때 toString 씀
		

		
		
		
		
		//중복체크가 되는가? --->> 중복의 정의가 필요하다.
		
		Point p04 = new Point(3, 6);	//중복값
		
		pSet.add(p04);	//p04라는 중복값 추가 --> 패키지 06에 있는 ex01에 Integer는 중복을 체크해줌.
						//equals 재정의? 주소값문제?
		
		System.out.println(pSet.toString());
		

		
		//Point 비교
		System.out.println(p02.equals(p04));
		
		
	}

}
