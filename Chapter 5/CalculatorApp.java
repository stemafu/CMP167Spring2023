import java.util.Scanner;

/* To get an in depth understanding of loops,
 * we need to create the following program.
 * 
 * Write a calculator program that performs the following three operations.
 * The absolute number of a value entered by a user.
 * The factorial of a number entered by a user.
 * and the sum of the first n natural number.
 * 
 * The program will first ask the user to enter a 
 * passcode to access the calculator. If the 
 * passcode is wrong, the calculator should continue to ask for the passcode until the correct passcode is entered by the user. We will use pass1234 as the correct passcode.
 * 
 * Once the correct passcode has been entered, 
 * next the user has to enter the operation they would like to perform. It will be abs for absolute, fact for factorial, and sum for the sum of the first n natural number.
 * 
 * If an incorrect operation is entered the program will keep on asking the user to enter the correct operation
 * 
 * Once the correct operation has been entered, the calculator app will perform the requested operation and print the result of the final answer to the user.
 * 
 * Later on, we will add a feature so that we can ask the user if they would like to perform another calculation starting from entering a passcode. 
 * This part will be done next week.
 */
public class CalculatorApp {

	public static void main(String[] args) {
		/* The program will first ask the user to enter a passcode 
		 * to access the calculator. If the passcode is wrong, 
		 * the calculator should continue to ask for the
		 * passcode until the correct passcode is entered by 
		 * the user. We will use pass1234 as the correct 
		 * passcode
		 */
		Scanner scan = new Scanner(System.in);

		/* At some point in time, we need to improve
		 * this code now how we are getting the passcode
		 * one we have learned do while loops
		 */
		//System.out.print("Enter your passcode: ");
		String userPasscode;
		//userPasscode= scan.next();

		String correctPasscode = "pass1234";
		String starOverAgain ="";

		/*If a an incorrect passcode is entered by the user,
		 * this loops will ensure that the program continues to
		 * loop through asking the user to enter a passcode
		 */

		do {
			do {
				System.out.print("Enter your passcode: ");
				userPasscode= scan.next();
			} while(!userPasscode.equals(correctPasscode));

			/*
		while(!userPasscode.equals(correctPasscode)) {
			System.out.println("You entered an incorrect passcode.");
			System.out.println("Please try again!");
			System.out.print("Enter your passcode: ");
			userPasscode = scan.next();
		}
			 */

			/* The correct passcode has been entered.
			 * We need to ask for an operation
			 * 
			 * We will also need to improve this code
			 * for getting the operation method once we
			 * have learned do while loops
			 */
			System.out.println("Enter your operation - abs for "
					+ "absolute, fact for factorial, and sum: ");
			String operation = scan.next();

			while(!operation.equals("abs") && 
					!operation.equals("fact") &&
					!operation.equals("sum") ) {
				System.out.println("Enter your operation - abs for "
						+ "absolute, fact for factorial, and sum: ");
				operation = scan.next();
			}

			/*When you get here it means the correct operation, was
		entered
			 */
			System.out.print("enter a number: ");
			int num = scan.nextInt();
			int answer = 0;

			if (operation.equals("abs")) {
				answer = Math.abs(num);
				System.out.println("Result: " + answer);
			} else if (operation.equals("fact")) {
				/* We will finish this part in class on
				 * Monday
				 */
			} else if (operation.equals("sum")) {
				answer = 0;
				int count = 1;
				while(count <= num) {
					answer = answer + count;
					count++;
				}
			}

			System.out.println("Would you like to do this over again?");
			starOverAgain = scan.next();
		}while(starOverAgain.equals("yes"));
		
		

	}

}
