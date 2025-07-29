package controlstatements;

import java.util.Scanner;

public class DIsplayDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number between 1 to 7 ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println(" Sunday ");
			return;
			
		case 2:
			System.out.println(" Monday ");
			return;
			
		case 3:
			System.out.println(" Tuesday ");
			return;
			
		case 4:
			System.out.println(" Wednesday ");
			return;
			
		case 5:
			System.out.println(" Thrsday");
			return;
			
		case 6:
			System.out.println(" Friday ");
			return;
			
		case 7:
			System.out.println(" Saturday ");
			return;
			
			default:
		
				System.out.println(" In valid number ");
				
		}

	}

}
