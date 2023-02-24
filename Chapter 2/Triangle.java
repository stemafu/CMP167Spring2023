import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double a, b, c, total, aSquared, bSquared;
		
		System.out.print("Enter a: ");
		a = scnr.nextDouble();
		
		System.out.print("Enter b: ");
		b = scnr.nextDouble();
		
		aSquared = Math.pow(a, 2.0);
		bSquared = Math.pow(b, 2.0);
		total = aSquared + bSquared;
		c = Math.sqrt(total);
		System.out.println(c);

	}

}
