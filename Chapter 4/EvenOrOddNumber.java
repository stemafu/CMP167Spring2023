import java.util.Scanner;
public class EvenOrOddNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a number: ");
		num = scanner.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("%d is even number%n", num);
		}else {
			System.out.printf("%d is odd number%n", num);
		}

	}

}
