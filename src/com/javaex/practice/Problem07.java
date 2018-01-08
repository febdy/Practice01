package com.javaex.practice;

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0, input = 0;
		String continueInput = "";
		boolean start = true;

		answer = (int) (Math.random() * 100 + 1);

		while (start) {
			System.out.println("------------------");
			System.out.println("    숫자맞추기게임시작");
			System.out.println("------------------");
			System.out.print(">>");
			input = sc.nextInt();

			if (answer < input) {
				System.out.println("더 낮게");
			} else if (answer > input) {
				System.out.println("더 높게");
			} else {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까? (y/n) >>");
				continueInput = sc.next();

				if (continueInput.equals("y")) {
					System.out.println("------------------");
					System.out.println("    숫자맞추기게임종료");
					System.out.println("------------------");
					start = false;
				} else {
					answer = (int) (Math.random() * 100 + 1);
				}
			}
		}
	}
}
