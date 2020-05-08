package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		i = sc.nextInt();
		
		if(i%2 == 0) {
			for(j=0;j<=i;j=j+2) {
				sum = sum + j;
			}
		} else {
			for(j=1;j<=i;j=j+2) {
				sum = sum + j;
			}
		}
		
		System.out.println("결과값: " + sum);

	}

}
