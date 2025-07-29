package operators;

import java.util.Scanner;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Increment And Decrement Operations ");
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(" Pre Increment : " + (++a));
		System.out.println ("Post Increment : " + (a++));
		System.out.println(" Pre decrement : " + (--a));
		System.out.println("Post decrement : " + (a--));
	}

}
