package com.greatlearning.Q2.Main;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.Q2.Service.MergeSortImplementation;
import com.greatlearning.Q2.Service.NotesCount;


public class Main {

	public static void main(String[] args) {

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();
		
		System.out.println("ENTER THE SIZE OF THE CURRENCY DENOMINATION ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("ENTER THE CURRENCY DENOMINATION VALUE");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("ENTER THE AMOUNT YOU WANT TO PAY");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes, amount);
	}
}
