package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {

		System.out.println("point관리------------------");
		MyList pList= new MyList();	//	메모리에 올림
		
		Point p00 = new Point(1, 1);
		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		
		
		pList.add(p00);
		pList.add(p01);
		pList.add(p02);
		
		for(int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		
		
		System.out.println("circle관리------------------");
		MyList cList = new MyList();
		
		Circle c00 = new Circle(5);
		Circle c01 = new Circle(10);
		Circle c02 = new Circle(15);
		
		cList.add(c00);
		cList.add(c01);
		cList.add(c02);
		
		
		//*************어떻게 해결하쉴?********************
		//cList.add(p02); 원 리스트에 점이 들어와도 오류발생하지 않는다.--> 위험함.
		//*********************************
		
		//System.out.println(cList.get(0).toString());
		
		//((Circle)(cList.get(0))).getRadius();
		
		
		
		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i));
		}
		
		
		
		
		
		
		
	}

}
