import java.util.Scanner;

public class decrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		System.out.print("Enter a 4-digit integer: ");
		int userInt = scnr.nextInt();
		int digFour = userInt % 10;
		int digThree = (userInt/10) % 10;
		int digTwo = (userInt/100) % 10;
		int digOne = (userInt/1000) % 10;
		
		int swap = digOne;
		digOne = digThree;
		digThree = swap;
		
		int swap2 = digTwo;
		digTwo = digFour;
		digFour = swap2;
		
		digFour = (digFour+10) - 7;
		digThree = (digThree+10) - 7;
		digTwo = (digTwo+10) - 7;
		digOne = (digOne+10) - 7;
		
		System.out.print("Deccrypted:");
		System.out.print(digOne);
		System.out.print(digTwo);
		System.out.print(digThree);
		System.out.print(digFour);
}
}
