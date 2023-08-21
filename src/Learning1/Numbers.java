package Learning1;

import java.util.Scanner;

public class Numbers {  
	
	//prime numbers
		static void checkPrime(int n){
		  int i,m=0,flag=0;    
		  m=n/2;    
		  if(n==0||n==1){
		   System.out.println(n+" is not prime number");    
		  }else{
		   for(i=2;i<=m;i++){    
		    if(n%i==0){    
		     System.out.println(n+" is not prime number");    
		     flag=1;    
		     break;    
		    }    
		   }    
		   if(flag==0)  { System.out.println(n+" is prime number"); }
		  }//end of else
		}
		public static void main(int a){
			int s=10;
			System.out.println(s);
		} 
		 public static void main(String args[]){ 
		  checkPrime(1);
		  checkPrime(3);
		  checkPrime(17);
		  checkPrime(20);
		   Scanner s = new Scanner(System.in);
	       System.out.print("Enter the first number : ");
	       int start = s.nextInt();
	       System.out.print("Enter the second number : ");
	       int end = s.nextInt();
	       System.out.println("List of prime numbers between " + start + " and " + end);
	       for (int i = start; i <= end; i++) {
	           if (isPrime(i)) {
	               System.out.println(i);
	           }
	       }
		
		  
	   }
	   public static boolean isPrime(int n) {
	       if (n <= 1) {
	           return false;
	       }
	       for (int i = 2; i <= Math.sqrt(n); i++) {
	           if (n % i == 0) {
	               return false;
	           }
	       }
	       return true;
}}