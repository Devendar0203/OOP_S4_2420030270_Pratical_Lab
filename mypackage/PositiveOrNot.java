package mypackage;

import java.util.Scanner;

public class PositiveOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if( a >=0 )
		{
			System.out.println(" The given number is positive " + a);
		}
		else
		{
			System.out.println("The given number is negative " +a);
		}

	}

}
