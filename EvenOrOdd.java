import java.util.Scanner;

public class EvenOrOdd{
	public static void main(String[] args) {

		/** Number is even otherwise it should print “Number is odd using IF

		Number declaration*/

		int num;

		//Create Scanner Object from scanner class to be used for user input reading

		Scanner myRead = new Scanner(System.in);

		//read the user input of type Integer using .nextInt mwethod using Scanner calls object method
		// num = myRead.nextInt();



		// if( num % 2 == 0){
		// 	System.out.println(num + "is even");
		// }else
		// {
		// 	System.out.println(num + "is odd");
		// }

		/*********SWAP NUMBERS***********/

		System.out.println("Enter number 1");
		int a= myRead.nextInt();

		System.out.println("Enter number 2");
		int b= myRead.nextInt();

		a = a + b; // 10 + 20 =30
		b = a - b; // 20 - 30 = -10
		a = b - a; // 30 - -10 = 40, 20
		System.out.println("Enter number -->" + a +"-->" + b);




		

	}
}