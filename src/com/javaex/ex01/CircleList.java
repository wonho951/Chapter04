package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

	//관리용도. 개념확장필요
	
	//필드
	private Circle[] cArray;
	private int crtCcl;
	
	//생성자
	public CircleList() {
		super();
		this.cArray = new Circle[3];
		this.crtCcl = 0;
	}
	
	//메소드 g/s
	
	//메소드 - 일반
	public void add(Circle circle) {
		cArray[crtCcl] = circle;
		crtCcl = crtCcl + 1;
	}
	
	public int size() {
		return crtCcl;
	}
	
	public Circle get(int index) {
		return cArray[index];
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtCcl=" + crtCcl + "]";
	}
	
	
}

