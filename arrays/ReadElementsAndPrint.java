package arrays;

import java.util.Scanner;

public class ReadElementsAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	int arr[]= new int[5];
	System.out.println("Enter the elements");
	for(int i=0;i<5;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("The elements are");
	for(int i=0;i<5;i++)
	{
		
		System.out.println(arr[i]);
	}

	}

}
