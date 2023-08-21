package JavaTPoint;

public class Operation {
	int square(int n) {
		return n * n;
	}
	static class Circle {
		Operation op;// aggregation
		double pi = 3.14;
		double area(int radius) {
			op = new Operation();
			int rsquare = op.square(radius);// code reusability (i.e. delegates the method call).
			return pi * rsquare;
		}

		static public void main(String args[]) {
			Circle c = new Circle();
			double result = c.area(5);
			System.out.println(result);
		}
	}
}