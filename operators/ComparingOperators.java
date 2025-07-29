package operators;

import java.util.Scanner;

public class ComparingOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Compare two integers and display which one is greater or if they are equal.
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		if(number1>number2)
		{
			System.out.println(number1+ " is greater ");
		}
		else if (number1==number2)
		{
			System.out.println(" both numbers  is equal ");
			
		}
		else
		{
		System.out.println(number+ " is Smaller ");
		}

	}

}
