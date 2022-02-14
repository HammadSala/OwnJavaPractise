public class NumberCheck{
	//Program to check number is even or using TERNARY OPERATION

	public static void main(String[] args) {
		//Declare and intialize the number
		int a =41;
		String result;
		//ternary operator logic check
		result =( ( a%2 )==0) ? "Even" : " Odd";
		System.out.println("Given Numner 41 "+ result);
	}
}