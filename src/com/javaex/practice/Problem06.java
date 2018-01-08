package com.javaex.practice;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, result = 0;
		System.out.println("숫자를 입력하세요.");
		n = sc.nextInt();

		if (n % 2 == 0) {
			for (int i = 2; i <= n; i += 2) {
				result += i;
			}
		} else {
			for (int i = 1; i <= n; i += 2) {
				result += i;
			}
		}

		System.out.println("결과값 : " + result);

	}

}
