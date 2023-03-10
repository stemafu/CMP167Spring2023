import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your number grade: ");
		int score = scanner.nextInt();
		String letterGrade = "";
		if(score >= 95)
			letterGrade = "A";
		else if( (score >= 90) && (score <= 94) )
			letterGrade = "A-";
		else if( (score >= 86) && (score <= 89) )
			letterGrade = "B+";
		else if( (score >= 83) && (score <= 85) )
			letterGrade = "B";
		else if( (score >= 80) && (score <= 82) )
			letterGrade = "B-";
		else if( (score >= 76) && (score <= 79) )
			letterGrade = "C+";
		else if( (score >= 73) && (score <= 75) )
			letterGrade = "C";
		else if( (score >= 70) && (score <= 72) )
			letterGrade = "C-";
		else if( (score >= 66) && (score <= 69) )
			letterGrade = "D+";
		else if( (score >= 63) && (score <= 65) )
			letterGrade = "D";
		else if( (score >= 60) && (score <= 62) )
			letterGrade = "D-";
		else
			letterGrade = "F";
		
		System.out.println(letterGrade);
	}

}
