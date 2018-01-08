package com.javaex.practice;

public class Problem03 {
	public static void main(String[] args) {
		for (int j = 1; j < 10; j++) {
			int i = 2;
			System.out.format("%d*%d=%2d   ", i, j, (i++ * j));
			System.out.format("%d*%d=%2d   ", i, j, (i++ * j));
			System.out.format("%d*%d=%2d   ", i, j, (i++ * j));
			System.out.format("%d*%d=%2d   ", i, j, (i++ * j));
			System.out.format("%d*%d=%2d   ", i, j, (i++ * j));
			System.out.format("%d*%d=%2d   ", i, j, (i++ * j));
			System.out.format("%d*%d=%2d   ", i, j, (i++ * j));
			System.out.format("%d*%d=%2d", i, j, (i++ * j));
			System.out.println();
		}
	}
}
