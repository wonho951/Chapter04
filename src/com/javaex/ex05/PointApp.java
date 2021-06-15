package com.javaex.ex05;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class PointApp {

	public static void main(String[] args) {

		/*
		List<Point> pList = new ArrayList<Point>();
		//ArrayList나 List나 다를건 없는데 import확인할것.
		
		Point p01 = new Point(2, 4);
		Point p02 = new Point(3, 6);
		Point p03 = new Point(4, 8);
		Point p04 = new Point(5, 10);
		
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		
		for(Point p: pList) {
			System.out.println(p);	//toString랑 같음.
		}
		*/
		
		
		
		//List<Point> pList= new ArrayList<Point>();	
		List<Point> pList = new LinkedList<Point>();	// --> 호환가능
		
		Point p01 = new Point(2, 4);
		Point p02 = new Point(3, 6);
		Point p03 = new Point(4, 8);
		Point p04 = new Point(5, 10);
		
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
		
		
		System.out.println("----------------------------------------");
		for (int i = 0; i < pList.size(); i++) {
			Point pp = pList.get(i);	//변수를 굳이 만들지 않아도 밑에처럼하면 출력 가능.
			System.out.println(pList.get(i).getX());	//x or y 하나만 찍어볼때는 사용가능.(여러개 찍을때는 pp.toString() 사용하거나 pp사용)
		}
		
		
		System.out.println("----------------------------------------");
		System.out.println(pList.toString());
		
		
		
		//p04 --> [1]에 담기.
		pList.add(1, p04);	//p04를 맨앞에 넣을 수 있음. --> 배열 순서 관리 가능.
		System.out.println(pList);
		
		
		//p04 --> [1]에서 삭제.
		pList.remove(1);	//배열에서 삭제를 해도 나머지 배열의 순서는 자동으로 정렬됨.
		System.out.println(pList);
		
		
		
		System.out.println("");
		System.out.println("향상된 for문--------------------------------------");
		//향상된 for문 --> 무조건 처음부터 끝까지갈때 쓰는애.기본 for문처럼 중간에 멈추기 불가.
		for(Point ppp : pList) {
			//System.out.println(ppp.getX());	pList에서 x의 값만 출력.
			System.out.println(ppp);
		}
		
		
		//pList 원 추가
		Circle c01 = new Circle();
		//pList.add(c01); ---> 오류남.제네릭으로 point만 줬기에 안됨.
		
		
		
	}

}
