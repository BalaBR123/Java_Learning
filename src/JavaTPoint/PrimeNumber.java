package JavaTPoint;
	//Java Program to illustrate the use of static variable which
	//is shared with all objects.
	public class PrimeNumber
	{
	//static int count=0;//will get memory only once and retain its value

/*Student7(){
	count++;//incrementing the value of static variable
	System.out.println(count);
	}
   
	*/
	//creating objects
	//Student7 c1=new Student7();
	//Student7 c2=new Student7();
	//Student7 c3=new Student7();
	  
		public static void main(String args[])
		 {  
		  int i,m=0,flag=0;    
		  int n=3;//it is the number to be checked  
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
		} 

	
	


