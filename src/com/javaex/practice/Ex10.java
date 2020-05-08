package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = new int[10];
		int input, max_num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		for(input=1;input<=5;input++) {
			System.out.print("숫자: ");
			i[input] = sc.nextInt();
			
			if(i[input] > max_num) {
				max_num = i[input];
			}
		}
		
		System.out.println("최대값은 " + max_num + "입니다.");
		
		
	}

}
