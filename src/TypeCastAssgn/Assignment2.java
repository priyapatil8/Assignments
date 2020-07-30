package TypeCastAssgn;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
	Scanner inputValue = new Scanner(System.in)	;
	
	System.out.println("Enter string value 100: ");
	
	String input = inputValue.nextLine();
	
	int inputInt = Integer.parseInt(input);
	
	byte inputByte = Byte.parseByte(input);
	
	float inputFl = Float.parseFloat(input);
	
	double inputDb = Double.parseDouble(input);
	
	System.out.println("Integer value is :"+inputInt);
	
	System.out.println("Byte value is :"+inputByte);
	
	System.out.println("Float value is :"+inputFl);
	
	System.out.println("Double value is :"+inputDb);
	
	

	}

}

