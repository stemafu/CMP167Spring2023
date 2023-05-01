
public class ArrayLesson2 {
	/* We can also be able to have arrays as parameters
	 * 
	 * We want to write a method that takes an int array
	 * parameter and returns sum of the values inside the
	 * array.
	 * 
	 * If the array being passed to the method is 
	 * nums = {3, 4, 6, 7, 8}, the method returns 28
	 */
	
	public static int sum(int [] nums) {
		int total = 0;
		
		for(int i = 0; i < nums.length; i++) {
			total = total + nums[i];
		}
		
		return total;
	}
	
	public static void display(int [] nums) {
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void swap(int a) {
		a = a + 50;
	}
	
	public static void swap(int [] nums, int first, int second) {
		int temp = nums[second];
		nums[second] = nums[first];
		nums[first] = temp;
	}
		
	/* returning arrays from a method
	 * 
	 */
	public static int [] reverseArray(int [] nums) {
		int [] reversedNums = new int [nums.length];
		
		int j = 0;
		for(int i = nums.length -1; i >= 0; i--) {
			reversedNums[j] = nums[i];
			j++;
		}
		
		return reversedNums;
	}
	
	public static void reverseArray2(int [] nums) {
		

		//int temp;
		for(int i = 0; i < nums.length / 2; i++) {
			//temp = nums[i];
			//nums[i] = nums[nums.length - 1 - i];
			//nums[nums.length - 1 - i] = temp;
			swap(nums, i, nums.length - 1 - i );
		}
	
	}	
	

	/* How to resize an array
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		int [] nums = {3, 4, 6, 7, 8};
		display( nums);
		
		/* we want to swap the values 8 and 3.
		 * 3 is an  index 0
		 * and 8 is an index 4
		 */
		
		// Create a temp variable
		
		swap(nums, 0, 4);
		//int temp = nums[4];
		//nums[4] = nums[0];
		//nums[0] = temp;
		display( nums);
		/* computing the sum of values inside
		 * an array
		 */
		
		int total = sum(nums);
		
		/*for(int i = 0; i < nums.length; i++) {
			total = total + nums[i];
		}*/
		
		System.out.println("Sum : " + total);
		double average = ((double) total) / nums.length;
		System.out.println("Average : " + average );

	}

}
