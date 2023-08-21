package Learning1;

public class Student {
		 int rollno;
		 String name;
		 void insertRecord(int r, String n){
		  rollno=r;
		  name=n;
		 }
		 void displayInformation()
		 {
			 System.out.println(rollno+" "+name);
			 }
		}
		class TestStudent4{
		 public static void main(String args[]){
		  new Student().insertRecord(111,"Karan");
		  new Student().insertRecord(222,"Aryan");
		}
		}

		
		/*//Java program to initialize the values from one object to another object.
		class Student6{
		    int id;
		    String name;
		    //constructor to initialize integer and string
		    Student6(int i,String n){
		    id = i;
		    name = n;
		    }
		    //constructor to initialize another object
		    Student6(Student6 s){
		    id = s.id;
		    name =s.name;
		    }
		    void display(){System.out.println(id+" "+name);}
		 
		    public static void main(String args[]){
		    Student6 s1 = new Student6(111,"Karan");
		    Student6 s2 = new Student6(s1);
		    s1.display();
		    s2.display();
		   }
		}
		*/
		
		class Student7{
		    int id;
		    String name;
		    Student7(int i,String n){
		    id = i;
		    name = n;
		    }
		    Student7(){}
		    void display(){System.out.println(id+" "+name);}
		 
		    public static void main(String args[]){
		    Student7 s1 = new Student7(111,"Karan");
		    Student7 s2 = new Student7();
		    s2.id=s1.id;
		    s2.name=s1.name;
		    s1.display();
		    s2.display();
		   }
		}

		