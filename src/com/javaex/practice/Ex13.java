package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		i = sc.nextInt();
		
		for(j=1;j<=i;j++) {
			sum = sum + j;
		}
		
		System.out.println("1에서" + i + "까지 누적합계: " + sum);
		
		sc.close();

	}

}
