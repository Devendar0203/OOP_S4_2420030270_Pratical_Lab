package controlstatements;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print the multiplication table for a given number.
		System.out.println("Enter the number :");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println( n+ " x " +i+ " = " +(n*i));
		}

	}

}
