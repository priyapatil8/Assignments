package TypeCastAssgn;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number 1-90 : ");
		
		String userNum = input.nextLine();
	
		
		float countFl = Float.parseFloat(userNum);
		
		double countDb = Double.parseDouble(userNum);
		
		byte countByt = Byte.parseByte(userNum);
		
		
		System.out.println("user input as Float value :"+countFl);
		
		System.out.println("user input as Double value :"+countDb);
		
		System.out.println("user input as Byte value :"+countByt);
		

	}

}
 