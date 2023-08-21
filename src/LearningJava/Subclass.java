package LearningJava;

public class Subclass extends Constructor {

	public Subclass(int t, int e, int m) {
		super(t, e, m);
    
	}

	public Subclass(String e, int m) {
		super(e, m);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 int v,m=0,flag=0;    
		  int n=3;//it is the number to be checked  
		  m=n/2;    
		  if(n==0||n==1){
		   System.out.println(n+" is not prime number");    
		  }else{
		   for(v=2;v<=m;v++){    
		    if(n%v==0){    
		     System.out.println(n+" is not prime number");    
		     flag=1;    
		     break;    
		    }    
		   }    
		   if(flag==0)  { System.out.println(n+" is prime number"); }
		  }//end of else
		System.out.println();
 	    //Fibonacci Series in Java without using recursion
 	    
 	    int n1=0,n2=1,n3,i,count=10;  
 	    System.out.print(n1+" "+n2);//printing 0 and 1  
 	     
 	    for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
 	    {  
 	     n3=n1+n2;  
 	     System.out.print(" "+n3);  
 	     n1=n2;  
 	     n2=n3;  
 	    }  
 	    System.out.println();
	    System.out.println();
	    
		//Let's see the fibonacci series program in java using recursion.
		  int count1=10;  
		  System.out.print(n1+" "+n2);//printing 0 and 1  
		  printFibonacci(count1-2);//n-2 because 2 numbers are already printed 
	}
	static int n1=0,n2=1,n3=0;  
	 static void printFibonacci(int count1){  
	    if(count1>0){  
	         n3 = n1 + n2;  
	         n1 = n2;  
	         n2 = n3;  
	         System.out.print(" "+n3); 
	         printFibonacci(count1-1);  
	     }  
	 }  
}
