package org.java.basics;
import java.lang.Math;

public class Triangle implements Polygon {
		   private int a, b, c;
		   private double s, area;

		// initializing sides of a triangle
		   Triangle(int a, int b, int c) {
		      this.a = a;
		      this.b = b;
		      this.c = c;
		      s = 0;
		   }

		// calculate the area of a triangle
		   public void getArea() {
		      s = (double) (a + b + c)/2;
		      area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		      System.out.println("Area: " + area);
		   }
		}

		class Main {
		   public static void main(String[] args) {
		      Triangle t1 = new Triangle(2, 3, 4);

		// calls the method of the Triangle class
		      t1.getArea();

		// calls the method of Polygon
		      t1.getPerimeter(2, 3, 4);
		   }
		}

