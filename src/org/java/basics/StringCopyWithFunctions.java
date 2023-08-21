package org.java.basics;

public class StringCopyWithFunctions {
	    public static void main(String[] args) {
	        String originalString = "Hello, World!";
	        String copiedString = new String(originalString); // Using constructor
	        
	        System.out.println("Original String: " + originalString);
	        System.out.println("Copied String (using constructor): " + copiedString);
	    }
	}
