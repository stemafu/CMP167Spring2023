import java.util.Scanner;

public class ArrayLesson3A {
	
	/* We want to learn how to resize arrays
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int [] nums = new int [1000];
		int num = scanner.nextInt();
		int i = 0;
		while(num > 0) {
			nums[i] = num;
			num = scanner.nextInt();
			
			i++;
			
			if(i == nums.length - 1){
				/* When the array is full, resize the array.
				*/
				
				int [] tempArray = new int[nums.length];
				/* Copy values from the nums array (orinal array), 
				 * into the temp array. 
				 */
				for(int j = 0; j < nums.length; j++ ) {
					tempArray[i] = nums[i];
				}
				/* With the above loop, the values inside the array
				 * we want to resize (original array) are 
				 * now stored inside a tempArray.
				 * 
				 * Next, we resize the original array.
				 * We are doubling the size of the original array
				 */
				nums = new int[nums.length *  2];
				//System.out.println("size" + nums.length);
				
				/*
				 * Copy the values from the temp array to the 
				 * newly resized original array
				 */
				for(int j = 0; j < tempArray.length; j++ ) {
					 nums[i] = tempArray[i];
				}
			}
		}
		
		System.out.println("You entered " + i + " values");
		
		for(int j = 0; j < i; j++) {
			System.out.print(nums[j] + " ");
		}


	}

}
