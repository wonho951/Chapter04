package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	//필드
	private Point[] pArray;
	private int crtPos;
	
	//생성자	
	public PointList() {
		super();
		this.pArray = new Point[3];
		crtPos = 0;
	}

	
	
	//메소드 g/s
	
	//메소드 - 일반
	public void add(Point point) {
		pArray[crtPos] = point;
		crtPos = crtPos + 1;	//crtPos++ 과 같음.
	}



	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
	
}
