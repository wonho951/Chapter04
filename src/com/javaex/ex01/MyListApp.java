package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		
		//포인트를 관리하는 리스트(배열 대용)를 만든다.
		PointList pList = new PointList();
		
		
		Point p00 = new Point(2, 2);
		Point p01 = new Point(3, 3);
		Point p02 = new Point(3, 3);
		
		pList.add(p00);	//알아서 배열에 들어가게함.
		pList.add(p01);
		pList.add(p02);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//배열 사용시
		Point[] pArray = new Point[2];	//이게 제일문제	
		
		Point p00 = new Point(2, 2);
		Point p01 = new Point(3, 3);
		
		pArray[0] = p00;
		pArray[1] = p01;
		
		for (int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		*/
	}

}
