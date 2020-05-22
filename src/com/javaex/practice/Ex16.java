package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, sum = 0, num_count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		i = sc.nextInt();
		
		for(j=1;j<=i;j++) {
			if(j%5 == 0) {
				num_count = num_count + 1;
				sum = sum + j;
			}
			
		}
		
		System.out.println("5의배수의 개수: " + num_count);
		System.out.println("5의배수의 합: " + sum);
		
		sc.close();

	}

}
