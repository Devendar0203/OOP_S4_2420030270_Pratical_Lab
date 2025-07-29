package operators;

import java.util.Scanner;

public class ShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//demonstrate left shift and right shift operations on an intege
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		System.out.println("Enter the Shift" );
		int shift = sc.nextInt();
		System.out.println(" Left shift operation (a<<shift)" + (a<<shift));
		System.out.println(" Right shift operation (a>>shift)" + (a>>shift));
		
		
	}

}
