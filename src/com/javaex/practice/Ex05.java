package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1에서 5까지 출력
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i=i+1;
		}

	}

}
