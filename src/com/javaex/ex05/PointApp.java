package com.javaex.ex05;


import java.util.ArrayList;
import java.util.List;

import com.javaex.ex04.Point;

public class PointApp {

	public static void main(String[] args) {

		
		List<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(2, 4);
		Point p02 = new Point(3, 6);
		Point p03 = new Point(4, 8);
		Point p04 = new Point(5, 10);
		
		
		pList.add(p01);
		pList.add(p02);	//위치 안정해주면 알아서 끝에 들어감
		pList.add(p03);
		
		
		for(Point p: pList) {
			System.out.println(p.toString());
		}
		
		
		
		
		
		
	}

}
