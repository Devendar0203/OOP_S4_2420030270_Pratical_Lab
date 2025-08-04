package arrays;
  import java.util.Scanner;
public class SearchForElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[8];
		System.out.println("Enter The Elements");
		for(int i=0;i<8;i++)
		{
			arr[i] = sc.nextInt();
		}
		int a =0;
		System.out.println("Enter the Number to search ");
		a=sc.nextInt();
		boolean present = false;
		int index=-1;
		for(int i=0;i<8;i++)
		{
			if(a==arr[i])
			{
				present= true;
				index = i;
				break;
			}
		}
		if(present)
		{
			System.out.println("The entered element " +a+ " is found .");
		}
		
		else
		{
			System.out.println("The Element " + a+ " is not  found . " );
		}

	}

}
