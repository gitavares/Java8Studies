package com.giselle;

import java.util.Scanner;

import javax.swing.SortOrder;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);
		
		printArray(myIntegers);
		
		printArray(sortIntegers(myIntegers));

	}
	
	public static int[] getIntegers(int capacity){
		System.out.println("Enter " + capacity + " integer values:\r");
		
		int[] values = new int[capacity];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	
	public static void printArray(int[] array){
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static int[] sortIntegers(int[] array){
		int[] sortedArray = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}
		
		boolean flag = true;
		int aux;
		
		while(flag){
			flag = false;
			for (int i = 0; i < sortedArray.length-1; i++) {
				if(sortedArray[i] < sortedArray[i+1]){
					aux = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = aux;
					flag = true;
				}
			}
		}

		return sortedArray;
	}

}
