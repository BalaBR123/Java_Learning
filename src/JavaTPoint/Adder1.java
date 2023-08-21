package JavaTPoint;

public class Adder1 {
	static int add1(int a, int b) {
		return a + b;
	}

	static double add(int a, int b) {
		return a+b;
	}

static class TestOverloading {
	public static void main(String[] args) {
		System.out.println(Adder1.add(11, 11));// ambiguity
	}
	
}
}