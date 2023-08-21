package org.java.basics;

public interface Polygon {
	// To use the sqrt function
	   void getArea();
	  
	 // calculate the perimeter of a Polygon
	   default void getPerimeter(int... sides) {
	      int perimeter = 0;
	      for (int side: sides) {
	         perimeter += side;
	      }

	   System.out.println("Perimeter: " + perimeter);
	   }
	}
