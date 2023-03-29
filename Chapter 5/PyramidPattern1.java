
public class PyramidPattern1 {

	public static void main(String[] args) {
		
		/*
		 * number of row is 5. We will use this for the
		 * outer loop
		 */
		for(int row = 1; row < 6; row++ ) {
			// spaces
			for(int column = 1; column < row; column++) {
				System.out.print("  ");
			}
			
			// Now, let us print the *s that come after the spaces
			// * asterisk
			for(int column = 1; column < (7 - row) ;column++){
				System.out.print( "* ");
			}
			
			System.out.println();
		}

	}

}
