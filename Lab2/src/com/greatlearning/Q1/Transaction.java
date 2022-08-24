package com.greatlearning.Q1;

import java.util.Scanner;

public class Transaction {
	public static void main(String args[]) throws Exception {

		Scanner obj= new Scanner(System.in);

		System.out.println("ENTER THE SIZE OF THE TRANSACTION ARRAY");

		int size = obj.nextInt();

		int arr[] = new int[size];

		System.out.println("ENTER THE VALUES OF THE ARRAY");

		for (int i = 0; i < size; i++)

			arr[i] = obj.nextInt();

		System.out.println("ENETER THE TOTAL NUUMBER OF TARGETS THAT ARE TO BE ACHIEVED");
		int targetNo = obj.nextInt();

		while (targetNo-- != 0) {

			int flag = 0;

			long target;

			System.out.println("ENTER THE VALUE OF THE TARGET");
			target = obj.nextInt();

			long sum = 0;

			for (int i = 0; i < size; i++) { 
				sum += arr[i];
				if (sum >= target) {
					System.out.println("TARGET ACHIEVED AFTER " + (i + 1) + " TRANSACTION ");
					flag = 1;
					break;
				}
			}
		if (flag == 0) {
				System.out.println(" TARGET NOT ACHIEVED ");
			}
		}
	}
}
