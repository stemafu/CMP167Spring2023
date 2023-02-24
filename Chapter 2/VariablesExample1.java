/*
 * Place your comments up here
 * Name:
 * Description:
 * Date created:
 * Date modified:
 * Email:
 * 
 * To get input from any user (via the keyboard)
 * we use a library called Scanner.
 */
import java.util.Scanner;

public class VariablesExample1 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		// Declare a variable called count
		int count;
		
		// Declare another variable called total
		int total;
		int num1;
		int num2;
		/* nextint() is an instruction from scanner
		 * that allows you to get an int from the keyboard
		 */
		
		System.out.print("Enter a number: ");
		num1 = scnr.nextInt();
		
		//We want to prompt for num2
		System.out.print("Enter another number: ");
		num2 = scnr.nextInt();
		
		total = num1 + num2;
		System.out.print("Total is ");
		System.out.println(total);
		// Assignment statements
		//count = 90 + 7;
		//.out.println(count);
        scnr.close();
	}

}
