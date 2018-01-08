package com.javaex.practice;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int max = Integer.MIN_VALUE;
		int n = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자:");
			n = sc.nextInt();

			if (n > max)
				max = n;
		}

		System.out.println("최대값은 " + max + "입니다.");
	}
}
