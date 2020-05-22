package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sel_num;
		boolean flag_exit = true,
				flag_ans = true, 
				flag_exitq = true;
		String exit;
		
		while(flag_exit) {
			flag_ans = true;
			flag_exitq = true;
			System.out.println("===============================");
			System.out.println("\t[숫자맞추기게임 시작]");
			System.out.println("===============================");
			int num = (int)(Math.random()*100)+1;
			
			while (flag_ans) {
				System.out.print(">>");
				sel_num = sc.nextInt();
				if(sel_num<num) {
					System.out.println("더 높게");
				} else if(sel_num>num) {
					System.out.println("더 낮게");
				} else {
					System.out.println("맞았습니다.");
					flag_ans = false;
					System.out.println("정답: " + num);
					System.out.println("계속하시겠습니까?(y/n)");
					while(flag_exitq) {
						exit = sc.next();
						if(exit.equals("n")) {
							flag_exit = false;
						} else if(exit.equals("y")) { 
							flag_exitq = false;
						} else {
							System.out.println("다시 입력해주세요(y/n)");
						}
					}
				}
			}
			
			
		}
		
	}

}
