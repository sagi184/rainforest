package programpractice1;

import java.awt.List;
import java.util.ArrayList;


	public class Test2{
		
	    public static void main(String args[])
	    {
	    	  //define limit
            int limit = 100;
           
            System.out.println("Prime numbers between 1 and " + limit);
           
            //loop through the numbers one by one
            for(int i=1; i < 100; i++){
                   
                    int isPrime = 1;
                   
                    //check to see if the number is prime

                for(int j=2; j < i ; j++){
                           
                            if(i % j == 0){
                                    isPrime = 0;
                                    break;
                            }
                    }
                    // print the number
                    if(isPrime== 1)
                            System.out.print(i + " ");
            }
	    	
	    	
	    }
		}

