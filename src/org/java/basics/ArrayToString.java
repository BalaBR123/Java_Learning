package org.java.basics;

//Java program to demonstrate Stream.count()
//method to calculate size/length of
//different arrays
import java.util.*;

//Driver Class
public class ArrayToString {
	// main function
	public static void main(String[] argv)
	{
		// Creating Array and Populating them
		int[] int_arr = { 1, 2, 3, 4, 5, 6, 7 };
		String[] str_arr
			= { "GFG", "GEEKS", "GEEKSFORGEEKS" };

		// print integer array
		System.out.println("Integer Array: "
						+ Arrays.toString(int_arr));

		// print string array
		System.out.println("String Array: "
						+ Arrays.toString(str_arr)
						+ "\n");

		// calculating the size/length of the arrays
		long ii = Arrays.stream(int_arr).count();
		long si = Arrays.stream(str_arr).count();

		// print the size/length of the arrays
		System.out.println("Size of integer array = " + ii);
		System.out.println("Size of string array = " + si);
	}
}
