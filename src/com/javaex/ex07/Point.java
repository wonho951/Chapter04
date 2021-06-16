package com.javaex.ex07;

public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		super();
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//메소드 g/s
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}


	//메소드 - 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}



	
	@Override
	public boolean equals(Object obj) {
		
		Point p = (Point)obj;
		if ((this.x == p.x) && (this.y == p.y)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		
		return x+y;// + 13 ;	//--> 1차 hashcode에서 거르고 2차로 equals에서 거르는데 혹시 모르니까 수학적으로 뒤에 이상한 숫자 붙여서 더 거른다.(똑똑하누)
	}
	
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	//코드 한줄이면 {} 생략 가능. 하지만 비추천.
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	*/
	
	
	
}
