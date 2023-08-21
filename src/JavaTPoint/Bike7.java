package JavaTPoint;

	//Instance initializer
	//What is invoked first, instance initializer block or constructor?

public class Bike7 {
	int speed;

	Bike7() {
		System.out.println("speed is " + speed);
	}

	{
		speed = 100;
	}
	{
		System.out.println("Instance initializer");
	}

	public static void main(String args[]) {
		Bike7 b1 = new Bike7();
		Bike7 b2 = new Bike7();
		b1.instance();
		{
			System.out.println("Instance initializer");
		}
		
	}

	private void instance() {
		// TODO Auto-generated method stub
		{
			System.out.println("This is Instance method");
		}
	}
}/*class A{  
A(){  
System.out.println("parent class constructor invoked");  
}  
}  
  
class B3 extends A{  
B3(){  
super();  
System.out.println("child class constructor invoked");  
}  
  
B3(int a){  
super();  
System.out.println("child class constructor invoked "+a);  
}  
  
{System.out.println("instance initializer block is invoked");}  
  
public static void main(String args[]){  
B3 b1=new B3();  
B3 b2=new B3(10);  
}  
}  */
