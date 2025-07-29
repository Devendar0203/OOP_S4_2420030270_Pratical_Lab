package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check if a student passed both theory and practical exams using logical AND.
		int theory = 50;
		int pratical = 40;
		
		if (theory>=50 && pratical <= 30)
			System.out.println("Student is passed in the both ");
		else
		System.out.println("Student is failed in exam");

	}

}
