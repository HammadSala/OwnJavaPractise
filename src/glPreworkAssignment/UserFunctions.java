package glPreworkAssignment;

import java.util.Scanner;

public class UserFunctions {
	
	/*
	 * Declaring Class properties
	 * */
	
	int userChoice; 
	int userValue;  

	//setter method to get user choice
	public void setuserChoice(Scanner inp1) {

		System.out.println("Please enter your choice of operation ?");
		System.out.println("0. Enter ZERO to exit the program");
		System.out.println("1. Check for Palindrome number ?");
		System.out.println("2. Prints the pattern of stars in decreasing order based on the input ?");
		System.out.println("3. Check whether the input number is a prime number");
		System.out.println("4. Print Fibonacci series of size n with first two numbers as 0, 1");

		userChoice = inp1.nextInt();

	}
	
	//getter method to get back user choice
	public int getuserChoice() {
		return this.userChoice;
	}
	
	//set user value for the switch choice
	public void setUservalue(Scanner inp1) {
		userValue = inp1.nextInt();
	}
	
	//get user value for the switch choice
	public int getUservalue() {
		return userValue;
	}
	
	/*
	 * Function definition to perform fibonacci series 0, 1,.....
	 * Initialize first 2 fib numbers 0 and 1
	 * Not process the logic if number is greater less the 2*/
	
	public  void findFibonacci(int userValue) {
		System.out.println("\n------------Fibonacci program -----------------\n");
		
		//DEclartions of needed variables
		int fb1 = 0;   
		int fb2 = 1;   
		int temp;
		
		/*
		 * Application Logic, adding the numbers n-1, n-2 to get n(sum of (n-1) + (n-2)
		 * Then Swap the numbers n--1= n-2 ; 
		 * n-2 =  (n-1) + (n-2)
		 */
		
		if(userValue < 2) {    
			System.out.println("Please enter an number greater than 2");
		}else
		{
			System.out.printf("The Fibonacci Series for the number %s %n ---> 0, 1", userValue); 
			
			
			for(int i =2; i < userValue; i ++)     
			{
				
				temp = fb1 + fb2;  
				fb1 = fb2;     
				fb2 = temp;
				System.out.print(", "+temp);
			}
			System.out.println("\n-------------------------------------------------\n");
		}
		
	
	}
	
	
	//Function to check whether the number is prime or not
	
	public  void checkPrime(int userValue) {
		
		//DEclaration of variables
		int n =2;
		int flag = 0;
		System.out.println("\n -----------------Prime program -----------------\n");
		
		/*
		 * Step1: Ruling out all even numbers scenario at first place
		 * Step2: A composite number is definitely made of  numbers, where at least one has to less than half of the number itself,
		 * so checking loop only till half -> n/2 condition
		 * incrementing by 2 since i have already checked for all even
		 */
		
		if(userValue % 2 == 0)
		{
			flag++;
		}else
		{
			for(int i =3; (i < userValue / 2) ; i+=n)
			{
				if(userValue % i == 0)
				{
					flag++;
					break;
				}
				
			}
		}
		if(flag > 0)
		{
			System.out.printf("Given Number %s is not a Prime number",userValue );
		}else
		{
			System.out.printf("Given number %s is a prime number", userValue);
		}
		
		
		System.out.println("\n-------------------------------------------------\n");
	}
	
	
	//Function to display start in descending order
	public  void starDisplay(int userValue) {
		System.out.println("\n-----------------Star display program-----------------\n");
		/*
		 * Using recursion logic here
		 * Nested loop concept, get the number print the number start using for loop
		 * Embrace the written for loop inside another for loop than starts at 5 and decrement by 1
		 * for every time exiting inner loop introduce a new line
		 */
		for(int i = userValue; i >= 1; i--)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print('*');
			}
			System.out.println("\n");
		}
		System.out.println("\n-------------------------------------------------\n");
	}

	//function to check if the given number is palindrome
	public  void palindrome(int userValue) {
		System.out.println("-----------------Palindrom program-----------------\n");
		
		//Variable declarations and getting the length of the number after converting to string
		
		int temp1, temp2;
		int paln = userValue;
		String comp1;
		int numLen = String.valueOf(paln).length();
		String revrNumber = "";
		
		/*
		 * Logic - I tried divide and process
		 * Removing the last number by doing modulo division, Followed by concatenating in empty string Object.
		 * getting the number skimping one last digit by normal division.
		 * Compare the entered value and the concatented string and display the result
		 * 
		 */
		do {
			temp1 = paln / 10;
			temp2 = paln % 10;
			numLen-=1;
			revrNumber = revrNumber + String.valueOf(temp2);
			paln = temp1;
			
			
		}while(numLen>=1);
		comp1 = String.valueOf(userValue);
		if(comp1.equals(revrNumber))
		{
			System.out.println("Given number is a palindrome \t" + userValue);
		}else
		{
			System.out.println("Given Number is not a Palindrome \t"+ userValue);
		}

		
		System.out.println("\n-------------------------------------------------\n");
		
		
	}

	//Switch function to perform action based on user choice
	public void userChoice(int userChoice, Scanner inp1) {

		switch(userChoice) {
		case 1:
			System.out.println("Enter the number to be checked for Palindrome\n");
			setUservalue(inp1);
			getUservalue();
			palindrome(userValue);
			break;
		case 2:
			System.out.println("Enter the number of stars to be displayed in descending order\n");
			setUservalue(inp1);
			getUservalue();
			starDisplay(userValue);
			break;
		case 3:
			System.out.println("Enter the number to be checked for Prime \n ");	
			setUservalue(inp1);
			getUservalue();
			checkPrime(userValue);
			break;
		case 4:
			System.out.println("Enter the number to be checked for Fibonacci Series \n");
			setUservalue(inp1);
			getUservalue();
			findFibonacci(userValue);
			break;
		case 0:

			System.out.println("Thank You, Good Bye!");
			break;
			
			}
	}
}
