import java.util.Scanner;
/*
 * Name:
 * Description:
 * Email:
 * Date created:
 * Date modified
 * Link video presentation: https://youtu.be/eIrMbAQSU34
 * 
 * 
 */
public class MethodsExample1 {

	/* Method example. This method prints LC to the
	 * screen
	 */
	public static void display() {
		System.out.println("LC");
	}	
	
	/*
	 * Parameters
	 * The following method prints the largest number of the
	 * given parameters.
	 */
	public static void max(int num1, int num2) {
		//
		
		if(num1 >= num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	
	
	/*
	 * Let us create a method that will display the 
	 * smallest number given any two numbers.
	 */
	public static void min(int num1, int num2) {
		if(num1 <= num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	
	/* Let us create a method that takes three int parameters 
	 * and displays the sum of the three parameters
	 */
	public static void sum(int num1, int num2, int num3) {
		int total = num1 + num2 + num3;
		System.out.println(total);
	}
	
	/* We can be able to define multiple methods with the same name
	 * but different parameters.
	 * 
	 * Method overloading
	 * This is the technique of defining multiple methods with the same
	 * name but different parameters.
	 */
	
	public static int multiply(int num1, int num2, int num3){
		int product = num1 * num2 * num3;
		
		return product;
	}
	
	
	public static int multiply(int num1, int num2) {
		int product = num1 * num2;
		return product;
	}

	public static double multiply(double num1, double num2) {
		double product = num1 * num2;
		return product;
	}
	
	
	/* Write a method that takes a string and returns the
	 * first and the last characters in the string.
	 * 
	 * If the parameter is empty (null), or contains no characters,
	 * the method should return a "?"
	 * 
	 * Example, if the string is product, the method return pt
	 * 
	 */
	public static String getFirstAndLastChars(String text){
		/*
		 * Error checking
		 */
		if(text == null) {
			return "?";
		}
		text = text.replace(" ", "");
		
		if(text.equals("")) {
			return "?";
		}
		
		String ans = ""+text.charAt(0) + text.charAt(text.length() - 1) ;
		return ans;
	}
	
	public static int divide(int num, int don) {
		
		if(don == 0) {
			System.out.println("You cannot divide by a zero");
			return don;
		}
		
		int ans = num / don;
		
		return ans;
	}
	
	/* Write a method that computes the sum of the first n
	 * natural numbers. 
	 * if n is 10, the method return 55
	 * if n is 0 or a negative number the method returns -1;
	 */
	
	public static int sum(int n) {
		//error checking first
		if(n <= 0) {
			return -1;
		}else {
			int total = 0;
			for(int i = 1; i <= n; i++) {
				total = total + i;
			}
			
			return total;	
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		int x = divide(9, 0);
		
		String txt = "Product";
		System.out.println(getFirstAndLastChars(txt));
		
		int count = multiply(9, 10, 5);
		
		System.out.println(multiply(5, 8));
		//System.out.println(multiply(50, 80, 90, 190));
		
		
		
		
		double num = 9;
		double sin = Math.sin(num);
		System.out.println(sin);
		
		MethodsExample1.sum(5, 12, 72);
		//MethodsExample1.display();
		//MethodsExample1.display();
		Scanner scan = new Scanner(System.in);
		
		MethodsExample1.max(90, 100);
		MethodsExample1.max(190, 100);
		MethodsExample1.max(-190, 100);
		MethodsExample1.max(19, 19);
		
		//System.out.println("Enter two numbers");
		//int n1 = scan.nextInt();
		//Syetem.out.println("Enter two numbers");
		//int n2 = scan.nextInt();
		
		//MethodsExample1.max(n1, n2);
		
		
		
		
	}
	
	
	

}
