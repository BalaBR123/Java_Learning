package org.java.basics;

public class StringCopyWithoutFunctions {
	    public static void main(String[] args) {
	        String originalString = "Hello, World!";
	        char[] originalChars = originalString.toCharArray(); // Convert to character array
	        
	        char[] copiedChars = new char[originalChars.length]; // Create a new character array for copying
	        
	        // Manual copying loop
	        for (int i = 0; i < originalChars.length; i++) {
	            copiedChars[i] = originalChars[i];
	        }
	        
	        String copiedString = new String(copiedChars); // Convert back to string
	        
	        System.out.println("Original String: " + originalString);
	        System.out.println("Copied String (without using functions): " + copiedString);
	    }
	}
