import java.util.Scanner; //Scanner object for input

public class InputJava{
	public static void main(String[] args) {
		

		//declare the input variables
		int inta;
		float floata;
		double doublea;
		boolean boola;
		char chara;

		//instantiate the scanner object

		Scanner in = new Scanner(System.in);
		//Taking input values from user
		System.out.println(" Print the integer value");
		inta = in.nextInt();
		System.out.println(" Print the float value");
		floata = in.nextFloat();
		System.out.println(" Print the double value");
		doublea = in.nextDouble();
		System.out.println(" Print the boolean value");
		boola = in.nextBoolean();
		System.out.println(" Print the character value");
		chara = in.next().charAt(0);

		//printing the values
		System.out.println("Integer "+ inta);
		System.out.println("float "+ floata);
		System.out.println("double  "+ doublea);
		System.out.println("boolean "+ boola);
		System.out.println("char "+ chara);


	}
}