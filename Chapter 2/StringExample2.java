import java.util.Scanner;
public class StringExample2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter your full name: ");
		String name = scnr.nextLine();
		
		System.out.println(name);
	}

}
