package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		//////////////////////////////////////////////
		//포인트 관리
		//////////////////////////////////////////////
		System.out.println("Point 관리========================");
		
		
		
		//포인트를 관리하는 리스트(배열 대용)를 만든다.
		PointList pList = new PointList();
		
		
		Point p00 = new Point(2, 2);
		Point p01 = new Point(3, 3);
		Point p02 = new Point(4, 4);
		
		pList.add(p00);	//알아서 배열에 들어가게함. 배열 1개   0x111
		pList.add(p01);	//배열2개
		pList.add(p02);	//배열3개
		
		System.out.println(pList);
		
		
		System.out.println(pList.size());	// 3
		
		
		System.out.println(pList.get(1).toString());	// int [x=3, y=3]
		System.out.println(pList.get(1));	//toString이랑 같음.
		System.out.println(pList.get(1).getX());	// 3

		System.out.println("================================");
		
		for (int i = 0; i < pList.size(); i++) {
			//System.out.println(pList.get(i));  --> toString랑 같음
			System.out.println(pList.get(i).getX());
		}
		
		
		
		
		
		//////////////////////////////////////////////
		//포인트 관리
		//////////////////////////////////////////////
		System.out.println("Circle 관리========================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
