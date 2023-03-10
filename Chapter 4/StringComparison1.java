
public class StringComparison1 {

	public static void main(String[] args) {
		String text1 = new String("lc");
		String text2 = new String("LC");
		
		/* In Java, we cannot use == to compare
		 * strings.
		 * Instead to compare strings in Java, we use
		 * the equals or the equalsIgnoreCase methods
		 * 
		 * str1.equals(str2)
		 * The equals method evaluates to true if the two strings
		 * being compared are equal. 
		 * The equal method is case sensitive.
		 * 
		 * The equalsIgnoreCase method evaluates to true if the 
		 * two strings being compared are the same regardless of
		 * their case.
		 * 
		 * The equalsIgnoreCase method is case insensitive. 
		 * 
		 */
		if( text1.equalsIgnoreCase(text2) )
			System.out.println("same");
		else
			System.out.println("not same");
		
		System.out.print(text1 + " " + text2);

	}

}
