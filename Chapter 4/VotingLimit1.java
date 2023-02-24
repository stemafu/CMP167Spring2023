import java.util.Scanner;

public class VotingLimit1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		
		System.out.print("Enter age: ");
		age = scan.nextInt();
		
		if( age >= 18) {
			System.out.println("Voting age!");
		} else {
			System.out.println("Not voting age!");
		}
	}

}
