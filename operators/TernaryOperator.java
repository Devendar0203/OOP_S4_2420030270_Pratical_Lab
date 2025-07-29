package operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. Find the greater of two numbers using a ternary operator.
		System.out.println("The Ternary Operator");
		System.out.println("Enter the Two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max = (a>b)?a:b;
		
		System.out.println(" the Greater number is "+ max);
		
		
		

	}

}
