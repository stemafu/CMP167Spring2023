
public class StringExample1 {

	public static void main(String[] args) {
		String name;
		name = "Lehman College";
		
		System.out.println(name);
		
		/* String concatenation is used to join
		 * one string with another string or a
		 * number.
		 */
		String text1;
		text1 = "1";
		
		String text2 = "3";
		
		String text3 = text1 + text2;
		System.out.println(text3);
		int total = 5 + 6;
		
		System.out.println("Total " + total);
		 
		String text4 = "Lehman College";
		
		int size = text4.length();
		System.out.println(size);
		
		char lastChar = text4.charAt(size - 1);
		System.out.println(lastChar);
		
		int someIndex = text4.indexOf("x");
		System.out.println(someIndex);
		
		
		String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
	}
}
