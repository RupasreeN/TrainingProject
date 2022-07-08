package com.rupa.java.arrayexample;

import java.util.Scanner;

public class SampleArray {
	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		sc.close();
	}

}
