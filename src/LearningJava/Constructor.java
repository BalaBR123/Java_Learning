package LearningJava;

public class Constructor {
	int tamil, english, maths;
	String area;
	int streetnum;

	public Constructor(int t, int e, int m) {
		tamil = t;
		english = e;
		maths = m;
	}

	public Constructor(String e, int m) {
		area = e;
		streetnum = m;
	}

	public static void main(String[] args) {
		Constructor subject = new Constructor(80, 82, 70);
		subject.learning();
	}

	public void learning() {
		System.out.println("The score of tamil is " + tamil);
		System.out.println("The score of english is " + english);
		System.out.println("The score of maths is " + maths);
		int a = 10, b = 20, c = 5;
		System.out.println(a-- + b-- + c--);
		System.out.println(--a + --b + --c);
	}

	public void coaching() {
		System.out.println("Coaching area " + area);
		System.out.println("Coaching street number " + streetnum);
	}

}