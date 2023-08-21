package LearningJava;

public class Name {
	public static void main(String[] args) {
		String name = "Elangovan Mathivanan";
		System.out.println(name.substring(10));
		
		boolean bl=false;
		System.out.println(bl);
		
                   
		System.out.println((long) 1278770033);
		System.out.println((int) 12.33);

		System.out.println((double) 1233);
       
		System.out.println((boolean)true);

		System.out.println((float) 16572);

		byte a=10;
		byte b=10;
		//byte c=a+b;
		byte c=(byte)(a+b);
		System.out.println(c);
		String[] names = {"Java","C","C++","Python","JavaScript"};  
		System.out.println("Printing the content of the array names:\n");  
		for(String name1:names) {  
		System.out.println(name1);  
		}  
		
		
	}

}
