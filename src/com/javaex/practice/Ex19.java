package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sel_num, bank_sum = 0, bank_in, bank_out;
		boolean flag = true,
				flag_bank = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			flag_bank = true;
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택>");
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.print("다시 입력해주세요\n선택>");
			}
			sel_num = sc.nextInt();
			switch(sel_num) {
			case 1:
				while(flag_bank) {
					System.out.print("예금액>");
					while(!sc.hasNextInt()) {
						sc.next();
						System.out.print("숫자가 아닙니다.\n예금액>");
					}
					bank_in = sc.nextInt();
					if(bank_in<=0) {
						System.out.println("1원 이상의 값을 입력해주세요");
					} else {
						bank_sum = bank_sum + bank_in;
						flag_bank = false;
					}
				}
				break;
			case 2:
				while(flag_bank) {
					System.out.print("출금액>");
					while(!sc.hasNextInt()) {
						sc.next();
						System.out.print("숫자가 아닙니다.\n출금액>");
					}
					bank_out = sc.nextInt();
					if(bank_sum < bank_out) {
						System.out.println("잔액이 부족합니다.");
						flag_bank = false;
					} else if (bank_out<=0) {
						System.out.println("1원 이상의 값을 입력해주세요");
					} else {
						bank_sum = bank_sum - bank_out;
						flag_bank = false;
					}
				}
				break;
			case 3:
				System.out.println("잔고액>" + bank_sum);
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("다시 입력해주세요");
			}
		}
		
		

	}

}
