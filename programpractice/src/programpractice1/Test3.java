package programpractice1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		{
			int length=100;
	/*		int i,j,k;
			for(i=1;i<5;i++)
			{
				for(j=4;j>=i;j--)
				{	
				System.out.print(" ");	
				}
				 for(k=1;k<=2*i-1;k++)
				 {
						System.out.print("*");
				 }
					System.out.println();
			}*/
	
		/*System.out.print("Prime number from 1 to" +length);
		
		for(int m=1; m<length; m++)
		{
			int count = 1;
		
		for(int n=2;n<m;n++)
		{
			if(m % n== 0)
			{
				count = 0;
				break;
			}
		}
			if(count == 1)
			
				System.out.print(m+ " ");
				
			
		}	
		}*/
		/*
		String str = "sagar";
		String reverse= "";
	    for(int i=str.length()-1;i>=0;--i)
	    {
	    	 reverse += str.charAt(i);  
	    	
	    }
	    System.out.print(reverse);
	    if(reverse.equalsIgnoreCase(str))
		{
		    System.out.print("string is pallindrome");

		}
	    else
	    {
	    	 System.out.print("string is pallindrome");

	    	
	    }
		}
*/	    
	  
	/*	   int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23,47,54,98,100,1};
           
           //assign first element of an array to largest and smallest
           int smallest = numbers[0];
           int largetst = numbers[0];
          
           for(int i=1; i< numbers.length; i++)
           {
                   if(numbers[i] > largetst)
                           largetst = numbers[i];
                   else if (numbers[i] < smallest)
                           smallest = numbers[i];
                  
           }
          
           System.out.println("Largest Number is : " + largetst);
           System.out.println("Smallest Number is : " + smallest);
   }
*/
		

        int a=0,b=1,c=0,size; 
   Scanner s=new Scanner(System.in); 
   System.out.print("Enter a range : "); 
   size=s.nextInt(); 
   System.out.print("\n"); 
   System.out.print(a+","+b+","); 
   while(c<=size) 
         { 
            c=a+b; 
            if(c<=size) 
              System.out.print(c+","); 
              a=b; 
              b=c; 
         } 
 } 
	}	
  
}
