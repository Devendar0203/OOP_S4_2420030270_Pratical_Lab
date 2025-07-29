package operators;

public class BitwiseAndComplementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demonstrate bitwise AND, OR, XOR, and complement operators on two numbers.
		System.out.println("Enter the two numbers");
		
		int x = 5, y = 3; 
        System.out.println("x & y = " + (x & y));   //and 
        System.out.println("x | y = " + (x | y));   //or
        System.out.println("x ^ y = " + (x ^ y));    //XOR
        System.out.println("~x =  " + (~x));         // Complement
        System.out.println();
		

	}

}
