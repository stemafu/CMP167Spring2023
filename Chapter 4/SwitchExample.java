import java.util.Scanner;
public class SwitchExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num;
		num = scanner.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		default:
			System.out.println("...");
		}
		
		System.out.println("This is outside of the switch");

	}

}
