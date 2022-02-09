package glPreworkAssignment; 						

import java.util.Scanner; 							

public class GLPrework {
	public static void main (String[] args){ 
		
		/*driver main class , entry point
		 * Declaring variables and defining functions to access the userfunction class
		 */
		
		boolean choice = true;						
		int userChoice;								
		UserFunctions user1 = new UserFunctions();	
		Scanner inp1 = new Scanner(System.in);     
	
		/*
		 *user choice function call and decide if from the choice that if we gonna run the next instance
		 * */
		do {                                     
			user1.setuserChoice(inp1);           
			userChoice = user1.getuserChoice();  
			if(userChoice == 0) {                
			}
			user1.userChoice(userChoice,inp1); 
			
			
		}while(choice);                         //check if the option picked is '0' EXIT
	}

}
