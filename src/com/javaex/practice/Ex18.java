package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		i = sc.nextInt();
		
		for(j=1;j<=i;j++) {
			for(k=i;j<=k;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(j=2;j<=i;j++) {
			for(k=1;k<=j;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
