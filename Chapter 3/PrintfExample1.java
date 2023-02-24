
public class PrintfExample1 {

	public static void main(String[] args) {
		
		//System.out.printf("Hello there!");
		//System.out.printf("CMP 167 at Lehman College!");
		String txt = "CMP 167";
		
		System.out.printf("%s we can be %d. %n", txt, 3 );
		System.out.printf("%s we can be %d. %n", txt, 3 );
		
		double r = 34.5;
		double areaCircle = Math.PI * Math.pow(r, 2);
		System.out.printf("circle area = %8.2f. %n", areaCircle);
		
		System.out.printf("1. %7s%n", "LC");
		System.out.printf("2. %7s%n", "CCNY");
		System.out.printf("3. %7s%n", "JJAY");
		System.out.printf("4. %7s%n", "Hos");
		System.out.printf("5. %7s%n", "Hunter");
		//System.out.printf("Enter the number of dimes: ");
		//System.out.print("Enter the number of dimes: ");
	
	}

}
