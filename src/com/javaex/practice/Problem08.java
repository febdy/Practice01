package com.javaex.practice;

import java.util.Scanner;

public class Problem08 {
	public static void start() {
		Scanner sc = new Scanner(System.in);
		int select = 0, input = 0, money = 0;
		boolean running = true;

		while (running) {
			System.out.println("-----------------------------------");
			System.out.println("  1.예금 || 2.출금 || 3.잔고 || 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>>");
			select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.print("예금액 : ");
				money += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액 : ");
				input = sc.nextInt();

				if (money < input)
					System.out.println("잔고가 없습니다.");
				else
					money -= input;
				break;
			case 3:
				System.out.print("잔고액 : ");
				System.out.println(money);
				break;
			case 4:
				running = false;
				break;
			default:
				System.out.println("다시입력해주세요.");
				break;
			}

		}
	}

	public static void main(String[] args) {
		start();
	}
}
