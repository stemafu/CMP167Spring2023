import java.util.Scanner;
public class IfElseIfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		String ans = "";
		if(num == 1) {
			ans = "one";
		}else if(num == 2) {
			ans = "two";
		}else if(num == 3 ) {
			ans = "three";
		}else
			ans = "any other number";
		
		System.out.println(ans);
	}

}
