package JavaTPoint;

public class Encapsulation {
	//Let's see the simple example of encapsulation that has only one field with its setter and getter methods.
	//A Java class which is a fully encapsulated class.
	//It has a private data member and getter and setter methods.
	//private data member
	private String name;
	//getter method for name
	public String getName(){
	return name;
	}
	//setter method for name
	public void setName(String name){
	this.name=name;
	
	}
//A Java class to test the encapsulated class.
static class Test{
public static void main(String[] args){
//creating instance of the encapsulated class
Encapsulation s=new Encapsulation();
//setting value in the name member
s.setName("vijay");
//getting value of the name member
System.out.println(s.getName());
}
}

}
