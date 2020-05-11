package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		for(int i=num;i>0;) {
			sum = sum + i;
			i--;
			i--;
		}

		sc.close();

		System.out.println("결과값: " + sum);

	}

}
