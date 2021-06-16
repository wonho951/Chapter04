package com.javaex.ex08;

import java.util.Map;
import java.util.HashMap;

public class PointApp {

	//메소드 - 일반
	public static void main(String[] args) {
		
		//Map
		//List<Point> pList = new ArrayList<Point>();
		
		Map<String, Point> pMap = new HashMap<String, Point>();

		Point p01 = new Point(1, 1);
		Point p02 = new Point(2, 2);
		Point p03 = new Point(3, 3);
		
		
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("유재석", p03);
		
		
		System.out.println(pMap.size());
		
		System.out.println(pMap.toString());
		
		System.out.println(pMap.get("이효리").getX());	//꺼내올때 먼저 키로 불러서 꺼내옴.
		
		
		Point p04 = new Point(100, 100);	//p04추가
		
		pMap.put("유재석", p04);	//키 = 유재석 --> 중복
		
		System.out.println(pMap.toString());	//유재석이 중복이기때문에 오류는 안나지만 출력시 03의 유재석이 수정되서 04의 유재석으로 출력됨.
		
		
		
		
		
		
		
	}

}
