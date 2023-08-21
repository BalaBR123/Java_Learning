package LearningJava;

public class LoopingFunction {

	public static void main(String[] args) {
		/*for(int row=8; row>=1; row--) 
		{
			for(int col=8; col>row; col--)
			{
			System.out.print(" ");	
			}
			for(int col2=1; col2<=row;col2++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
	/*	for(int row=1;row<=5;row++) 
		{
		for(int col=1;col<=5;col++)
		{
			System.out.print(col+" ");
		}
		System.out.println();
		}*/
		/*for(int row=5;row>=1;row--) 
		{
		for(int col=1;col<=row;col++)
		{
			System.out.print(col+" ");
		}
		System.out.println();
		}*/
	/*	for(int row=1; row<=5;row++)    // 1 2 3 4 5
		                                // 2 3 4 5
		{                               // 3 4 5  
		for(int col=1;col<=5;col++)     // 4 5
		                                // 5 
		{
			System.out.print(row+" ");
		}
		System.out.println();
		}*/
		/*for(int i=5; i>=1;i--)
		{
		for(int j=1; j<i;j++) 
		{
		System.out.print(" ");
		}
		for(int k=1;k<=6-i;k++)
		{
		System.out.print(k+ " ");
		}
        System.out.println();
		}*/
		/*for(int i=1; i<=5;i++)
		{
		for(int j=5; j>i;j--) 
		{
		System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
		System.out.print(k+ " ");
		}
        System.out.println();
		}*/
		/*for(int row=1;row<=5;row++)
		{
		for(int col=1;col<row;col++)
		{
			System.out.print(" ");
		}
		for(int col2=1;col2<=6-row;col2++)
		{
			System.out.print(col2 + " ");
		}
		System.out.println();
		}*/
		/*
		for(int row=1;row<=5;row+=2)
		{
		for(int col=1;col<row;col++)
		{
			System.out.print(" ");
		}
		for(int col2=1;col2<=6-row;col2++)
		{
			System.out.print(" *");
		}
		System.out.println();
		}
		*/

		for(char C='A';C<='Z';C++) 
		{
		System.out.print(C+" ");	
		}
		//System.out.println((int)(12.33));
	}
}
