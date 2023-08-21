package Learning1;

import java.util.Scanner;

public class Class {
			int x;

		 // Constructor with a parameter
		  public Class(int x) {
		    this.x = x;
		  }

		  // Call the constructor
		  public static void main(String[] args) {
		    Class myObj = new Class(5);
		    System.out.println(myObj.x);
		    //Parse
		    System.out.println("Please only enter the string ");
		    Scanner sc=new Scanner(System.in);
		    String input = sc.nextLine();
		    System.out.println(input);
		//    int number = Integer.parseInt( input ); 
		   // System.out.println(number);
}
}
