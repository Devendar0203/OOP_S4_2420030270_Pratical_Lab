package controlstatements;

import java.util.Scanner;

public class GradeMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Enter the student marks ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
	if(marks<0 || marks >100)
	{
		System.out.println(" Enter the valid marks ");
	}
	else if(marks >=90)
	{
		System.out.println(" Grade A+ ");
	}
	else if(marks>=80)
	{
		System.out.println(" grade A ");
	}
	else if(marks>=70)
	{
		System.out.println("grade B ");
	}
	else if(marks>=60)
	{
		System.out.println(" grade C ");
	}
	else if(marks<35)
	{
		System.out.println(" Fail ");
	}
	}

}
