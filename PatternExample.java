package com.talentfork.overriding;

public class PatternExample {

	public static void main(String[] args) {
		int[] arr = { 1, 55555, 24, 308, 1679 };
		int maxLen = getMaxLength(arr);
		printPattern(arr, maxLen);
		System.out.print("+\n");
		printNumbersWithSpace(arr, maxLen);
		printPattern(arr, maxLen);
		System.out.print("+");
	}

	public static void printPattern(int[] arr, int maxl) {
		for (int i = 0; i < arr.length; i++) {
			printHeader(maxl);
		}
	}

	public static void printNumbersWithSpace(int[] A, int maxLen) {
		for (int i = 0; i < A.length; i++) {
			int spaceCnt = maxLen - String.valueOf(A[i]).length();
			if (i == 0)
				System.out.print("|");
			for (int j = 0; j < A.length; j++) {
				if (spaceCnt > 0) {
					System.out.print(" ");
					spaceCnt--;
				}
			}
			System.out.print(A[i] + "|");
		}
		System.out.println();
	}

	public static int getMaxLength(int[] A) {
		int maxElement = 0;
		int maxLen = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > maxElement) {
				maxElement = A[i];
			}
		}
		maxLen = String.valueOf(maxElement).length();
		return maxLen;
	}

	public static void printHeader(int maxLen) {
		for (int i = 0; i < maxLen; i++) {
			if (i == 0 || i == maxLen) {
				System.out.print("+");
			}
			System.out.print("-");
		}
	}

}
