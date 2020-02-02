import java.util.Scanner;

public class encrypt {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		System.out.print("Enter a 4-digit integer: ");
		int userInt = scnr.nextInt();
		int digFour = userInt % 10;
		int digThree = (userInt/10) % 10;
		int digTwo = (userInt/100) % 10;
		int digOne = (userInt/1000) % 10;
		
		digFour = (digFour+7) % 10;
		digThree = (digThree+7) % 10;
		digTwo = (digTwo+7) %10;
		digOne = (digOne+7) % 10;
		
		int swap = digOne;
		digOne = digThree;
		digThree = swap;
		
		int swap2 = digTwo;
		digTwo = digFour;
		digFour = swap2;
		
		System.out.print("Encrypted:");
		System.out.print(digOne);
		System.out.print(digTwo);
		System.out.print(digThree);
		System.out.print(digFour);
	}
}
