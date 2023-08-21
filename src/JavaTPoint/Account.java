package JavaTPoint;

public class Account {

	// Java Program to demonstrate the working of a banking-system
	// where we deposit and withdraw amount from our account.
	// Creating an Account class which has deposit() and withdraw() methods
	
	static int acc_no;
	static String name;
	static float amount;
	//Method to initialize object
	 void insert(int a,String n,float amt)
	 {
	acc_no=a;
	name=n;
	amount=amt;
	}
	//deposit method
	void deposit(float amt){
	amount=amount+amt;
	System.out.println(amt+" deposited");
	}
	//withdraw method
	void withdraw(float amt)
	{
	if(amount<amt)
	{
	System.out.println("Insufficient Balance");
	}
	else{
	amount=amount-amt;
	System.out.println(amt+" withdrawn");
	}
	}
	//method to check the balance of the account
	void checkBalance()
	{
		System.out.println("Balance is: "+amount);
		}
	//method to display the values of an object
	void display()
	{
		System.out.println(acc_no+" "+name+" "+amount);
	}
	

	// Creating a test class to deposit and withdraw amount
 static	class TestAccount {
		public static void main(String[] args) 
		{
			Account a1 = new Account();
			a1.insert(832345, "Ankit", 1000);
			a1.display();
			a1.checkBalance();
			a1.deposit(40000);
			a1.checkBalance();
			a1.withdraw(15000);
			a1.checkBalance();
		}
	}

}
    
class Student7{
    int id;
    String name;
    Student7(int i,String n){
    id = i;
    name = n;
    }
    Student7(){}
    void display()
    {
    	System.out.println(id+" "+name);
    }
 public static void main(String args[]){
    Student7 s1 = new Student7(111,"Karan");
    Student7 s2 = new Student7();
    s2.id=s1.id;
    s2.name=s1.name;
    s1.display();
    s2.display();
   }
}
//Java Program to illustrate the use of static variable which
//is shared with all objects.
class Counter2{
static int count=0;//will get memory only once and retain its value

Counter2(){
count++;//incrementing the value of static variable
System.out.println(count);
}

public static void main(String args[]){
//creating objects
Counter2 c1=new Counter2();
Counter2 c2=new Counter2();
Counter2 c3=new Counter2();
}
}


