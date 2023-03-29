
import java.util.Scanner;
public class BreakExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		while(num >= 0 ) {
			count++;
			int grades = 0;
			if(count >= 3) {
				System.out.println(grades);
				break;
			}
			
			System.out.print("Enter a number: ");
			num = scan.nextInt();
		}
		
		
		//System.out.println(grades);

	}

}
