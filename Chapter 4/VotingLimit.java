import java.util.Scanner;
public class VotingLimit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		
		System.out.print("Enter your age: ");
		age = scan.nextInt();
		
		if(age >= 18) {
			System.out.println("Voting age!");
		}
		System.out.println("This is outside the if");
		

	}

}
