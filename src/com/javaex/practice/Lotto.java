package com.javaex.practice;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lotto[] = new int[6];
		int temp;
		for(int i = 0;i<lotto.length;i++) {
			int num = (int)(Math.random()*45)+1;
			lotto[i] = num;
			if(Arrays.asList(lotto).contains(num)) {
				i = i - 1;
			}
			/*
			for(int j = 0;j<i;j++) {
				if(lotto[j] == lotto[i]) {
					i--;
				}
				
			}
			*/
			
			/*
			for(int k = 0;k<i;k++) {
				if(lotto[i] < lotto[k]) {
					temp = lotto[k];
					lotto[k] = lotto[i];
					lotto[i] = temp;
				}
			}
			*/
		}
		Arrays.sort(lotto);
		for(int a = 0;a<lotto.length;a++) {
			System.out.print(lotto[a] + "\t");
		}


	}

}
