import java.util.Scanner;
public class ArrayLesson1 {

	public static void main(String[] args) {
		
		//int [] examScores = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many exam scores do you have? ");
		int size = scanner.nextInt();
		
		int [] examScores;
		examScores = new int[size];
		
		
		//Storing values inside an array
		//examScores[0] = examScores[1] = scanner.nextInt();
		for(int i = 0; i < examScores.length; i++) {
			System.out.print("Enter a number: ");
			examScores[i] = scanner.nextInt();
		}
		int x ;
		int y;
		x = y = 90;
		
		//System.out.println(examScores[1] );
		
		for(int i = 0; i < examScores.length; i++) {
			System.out.println(examScores[i]);
		}
		
		//how about the above example but with while loop
		
		int i = 0;
		
		while (i < examScores.length) {
			System.out.println(examScores[i]);
			i++; // i = i + 1
		}
		
	}

}
