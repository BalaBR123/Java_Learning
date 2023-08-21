package LearningJava;
public class JavaTPoint {
	
		 public enum Day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  }  
	
		 public static void main(String args[])  
	       {  
	    	   int k=1;
	    	   do{
	    	   System.out.println(k);
	    	   k++;
	    	   }
	    	   while(k<=10);
	    	   
	    	   
	    	   aa:
	    			for(int i=1;i<=3;i++){
	    				bb:
	    					for(int j=1;j<=3;j++){
	    						if(i==2&&j==2){
	    							break aa;
	    						}
	    						System.out.println(i+" "+j);
	    					}
	    			}

	    	   //outer loop 
	    	    for(int s=1;s<=3;s++){  
	    	            //inner loop
	    	            for(int g=1;g<=3;g++){  
	    	                if(s==2&&g==2){  
	    	                    //using break statement inside the inner loop
	    	                    break;  
	    	                }  
	    	                System.out.println(s+" "+g);  
	    	            }  
	    	    }
	    	   
	    	    System.out.println();
	    	    System.out.println();
	    	    
	    	   
	         Day[] DayNow = Day.values();  
	           for (Day Now : DayNow)  
	           {  
	                switch (Now)  
	                {  
	                    case Sun:  
	                        System.out.println("Sunday");  
	                        break;  
	                    case Mon:  
	                        System.out.println("Monday");  
	                        break;  
	                    case Tue:  
	                        System.out.println("Tuesday");  
	                        break;       
	                    case Wed:  
	                        System.out.println("Wednesday");  
	                        break;  
	                    case Thu:  
	                        System.out.println("Thursday");  
	                        break;  
	                    case Fri:  
	                        System.out.println("Friday");  
	                        break;  
	                    case Sat:  
	                        System.out.println("Saturday");  
	                        break;  
	                }  
	            }  
	        // \u000d System.out.println("Java comment is executed!!");
	}
}
