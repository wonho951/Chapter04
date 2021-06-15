package com.javaex.ex04;

import java.util.ArrayList;

public class PointApp {

	public static void main(String[] args) {

		ArrayList<Point> pList= new ArrayList<Point>();	//Point만 들어오게함.
		
		Point p01 = new Point(2, 4);
		Point p02 = new Point(3, 6);
		Point p03 = new Point(4, 8);
		
		pList.add(p01);
		System.out.println(pList.size());
		
		
		pList.add(p02);	//위치 안정해주면 알아서 끝에 들어감
		System.out.println(pList.size());
		
		pList.add(p03);
		
		
		Point p = pList.get(1);
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p.toString());
		System.out.println(p);
		
		
		
		
		
		System.out.println("----------------------------------------");
		for (int i = 0; i < pList.size(); i++) {
			Point pp = pList.get(i);
			System.out.println(pp.toString());
		}
		
		
		
		
		
		
		
		
		
	}

}
