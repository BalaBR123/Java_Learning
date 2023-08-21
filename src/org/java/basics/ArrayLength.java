package org.java.basics;

//Java program to demonstrate for loop
//to calculate size/length of all type of arrays

import java.util.*;

public class ArrayLength {
	public static void main(String[] argv)
	{

		// Creating Arrays and Populating them
		char[] char_arr = { 'a', 'b', 'c', 'd', 'e' };
		int[] int_arr = { 1, 2, 3, 4, 5, 6, 7 };
		String[] str_arr
			= { "GFG", "GEEKS", "GEEKSFORGEEKS" };

		int ci = 0, ii = 0, si = 0;

		// print char array
		System.out.print("Char Array: [ ");
		for (char c : char_arr) {
			System.out.print("'" + c + "' ");
			ci++;
		}
		System.out.println("]");

		// print integer array
		System.out.print("Integer Array: [ ");
		for (int c : int_arr) {
			System.out.print(c + " ");
			ii++;
		}
		System.out.println("]");

		// print string array
		System.out.print("String Array: [ ");
		for (String c : str_arr) {
			System.out.print("'" + c + "' ");
			si++;
		}
		System.out.println("]\n");

		// print the size/length of all arrays
		System.out.println("Size of char array = " + ci);
		System.out.println("Size of integer array = " + ii);
		System.out.println("Size of string array = " + si);
	}
}

//This code is contributed by Susobhan Akhuli
