package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, sum = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼 n!");
		System.out.println("숫자를 입력하세요");
		i = sc.nextInt();
		
		for(j=1;j<i;j++) {
			sum = sum*j;
			System.out.print(j + "*");
		}
		System.out.println(i + "\n= " + i + "!\n= " + sum);
		

	}

}
