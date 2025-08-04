package arrays;

import java.util.Scanner;
public class StudentsMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new  int[6];
		int total = 0;
		int average = 0;
	System.out.println("Enter the student marks:");
	
	for(int i=0;i<6;i++)
	{
		arr[i] = sc.nextInt();
		
		total = total + arr[i]; 
	}
	
	System.out.println("The student marks is ");
	for(int i=0;i<6;i++)
	{
		System.out.println(arr[i]);
	}
	 average = total/6;
	System.out.println("The Total marks is :" + total);
	System.out.println("Average of marks is :" +average);


	}

}
