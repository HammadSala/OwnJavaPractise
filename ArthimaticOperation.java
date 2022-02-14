public class ArthimaticOperation{
	//Addition, Subtraction, Division, Multiplication
	// Create basic program to declare variables num1, num2 and result of type float.

	// Perform following operation

	// Addition, Subtraction, Division, Multiplication
	public static void main(String[] args) {
		//variable declaration
		float num1;
		float num2;
		float result;

		//Value assignement
		num1 = 19;
		num2 = 13;

		//mathamatic Operation and dispaly
		// result = num1 + num2;
		System.out.println("\nAddition of numbers is -->"+ (num1 + num2) );
		result = num1 - num2;

		System.out.println("\nSubtraction of numbers is -->"+ result);
		result = num1 / num2;
		System.out.println(result);

		System.out.printf("\nDivision of numbers is -->%f", result);
		result = num1 * num2;

		System.out.printf("Multiplication of numbers ", result);
	





	}
}