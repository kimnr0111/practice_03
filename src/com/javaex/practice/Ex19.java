package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sel_num, bank_sum = 0, bank_in, bank_out;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택>");
			sel_num = sc.nextInt();
			switch(sel_num) {
			case 1:
				System.out.print("예금액>");
				bank_in = sc.nextInt();
				bank_sum = bank_sum + bank_in;
				break;
			case 2:
				System.out.print("출금액>");
				bank_out = sc.nextInt();
				if(bank_sum < bank_out) {
					System.out.println("잔액이 부족합니다.");
				} else {
					bank_sum = bank_sum - bank_out;
				}
				break;
			case 3:
				System.out.println("잔고액>" + bank_sum);
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("다시입력해주세요");
			}
		}
		
		

	}

}
