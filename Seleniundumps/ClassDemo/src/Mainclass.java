import java.util.Scanner;

import democlasspractice.Calculator;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		
		
		Calculator cal = new Calculator();
		
		int addition= Calculator.add(num1 , num2);
		System.out.println("The result is " +addition);
		
		int Sub= cal.sub(num1 , num2);
		System.out.println("The result is " +Sub);
		
		int Mul= cal.mul(num1 , num2);
		System.out.println("The result is " +Mul);
		
		int Div= cal.div(num1 , num2);
		System.out.println("The result is " +Div);
		
		

	}

}
