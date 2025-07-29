package controlstatements;

import java.util.Scanner;

public class AcceptNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 6. Accept numbers until user enters 0.
		
		 Scanner sc = new Scanner(System.in);
	        int number;

	        System.out.println("Enter numbers (0 to stop):");

	        do {
	            number = sc.nextInt();
	            if (number != 0) {
	                System.out.println("You entered: " + number);
	            }
	        } while (number != 0);

	        System.out.println("Program stopped. You entered 0.");
	    
	}

}
