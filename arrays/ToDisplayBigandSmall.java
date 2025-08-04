package arrays;
import java.util.Scanner;
public class ToDisplayBigandSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		System.out.println("Enter the Elements");
		{
			for(int i=0;i<9;i++)
			{
				arr[i]= sc.nextInt();
				
			}
			int small=arr[0];
			int big=arr[0];
			
			for(int i=0;i<9;i++)
			{
				if(arr[i]>big)
				{
					big=arr[i];
				}
				if (arr[i]<small)
				{
					small=arr[i];
			    }
	
			}
			System.out.println("The largest element is " +big);
			System.out.println("The Smallest element is " +small);
			
			
		}
	}

}
