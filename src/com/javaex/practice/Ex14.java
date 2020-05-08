package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		i = sc.nextInt();
		
		for(j=1;j<=i;j++) {
			if(j == i) {
				System.out.println(j);
			} else {
				System.out.print(j + "+");
			}
			sum = sum + j;
		}
		
		System.out.println("합계: " + sum);

	}

}
