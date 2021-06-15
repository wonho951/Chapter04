package com.javaex.ex06;

import java.util.HashSet;

public class Ex01 {
	
	public static void main(String[]args) {
		
		//set --> 데이터 보관용
		
		//HashSet만든다
		//HashSet iSet = new HashSet(); --> 원래 알고 있는 데이터 올리는 방식
		//HashSet<Integer> iSet = new HashSet<Integer>();	--> 원래 쓰면 이렇게
		HashSet<Integer> iSet = new HashSet<Integer>();	//--> 섞어쓰기.
		
		//원래의방법
		//Integer i01 = new Integer(4);	
		//iSet.add(i01);
		
		
		// 이렇게 해도 됨.
		Integer i01 = 4;
		Integer i02 = 5;
		Integer i03 = 6;
		
		
		iSet.add(i01);	//추가 
		iSet.add(i02);
		iSet.add(i03);
		
		System.out.println(iSet.size());	// 크기 체크.

		System.out.println(iSet.toString());
		System.out.println("-------------------------");
		
		/*방번호의 개념이 없기때문에 일반 for문 못씀.
		for(int i = 0; i < iSet.size(); i++) {
			//iSet.get(1); 
		}
		*/
		
		//확장된 for문 써야 출력가능.
		for (Integer num : iSet) {
			System.out.println(num.toString());

		}
		
		
		System.out.println("중복된 숫자 시도---------------------");
		//중복값 시도.
		Integer i04 = 5;
		iSet.add(i04);
		
		for (Integer num : iSet) {
			System.out.println(num.toString());

		}		
		//결과적으로 출력했을때 중복체크되서 같은 수는 한개만 출력된다.
		
	}
	
}
