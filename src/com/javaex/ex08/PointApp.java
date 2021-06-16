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
		
		
	}

}
