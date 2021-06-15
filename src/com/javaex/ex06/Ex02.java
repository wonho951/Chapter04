package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		/*
		Set<Integer> lotto = new HashSet<Integer>();
		
		
		Integer lott = (int)(Math.random()*45)+1;
		
		for (int i = 0; i <= 6; i++) {
			System.out.println(lott);
		}
		*/
		
		//선생님 방법
		//반복(숫자가 <=6때까지
			//랜덤 숫자를 생성한다
			//Set 에 넣는다.
		
		Set<Integer> lottoSet = new HashSet<Integer>();
		
		while(lottoSet.size() < 6) {	//6번 돌려야하기때문에 조건 저렇게 줌.
			int num = (int)(Math.random()*45)+1;
			lottoSet.add(num);	//중복체크
		}
		
		
		for(int lottoNo : lottoSet) {
			System.out.print(lottoNo + "	");
		}
		
		
		//준식이꺼
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(true) {
			if (lotto.size()==6) {
				break;
			}
			lotto.add(Ltto());
		}
		
		System.out.println(lotto);
		
		
		
		
		
		
		
		
		
	}

	static Integer Ltto() {
		return (int)(Math.random()*45)+1;
	}
	
}
	