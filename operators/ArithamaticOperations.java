package operators;

import java.util.Scanner;
import java.util.*;
public class ArithamaticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// performin the all arithamtic operations
		System.out.println("Enter the two Number ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c= a+b;
		int d=a-b;
		int e=a*b;
		int f=a%b;
		System.out.println("The Sum of two numbers is " +c);
		System.out.println("The Sub of two numbers is " +d);
		System.out.println("The Multiplication of two numbers is " +e);
		System.out.println("The Division of two numbers is " +f);
	

	}

}
