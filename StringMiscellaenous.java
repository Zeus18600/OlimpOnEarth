package Strings16;

public class StringMiscellaenous {

	public static void main(String[] args) {
		
		String s1 = "hello there";
		char[] charArray = new char[5];
		
		System.out.printf("s1: %s", s1);
		
		// test length method
		System.out.printf("\nLength of s1: %d\n", s1.length());
		
		// loop through characters in s1 with charAt and display reversed
		for (int count = s1.length() -1; count >= 0; count--)
			System.out.printf("%c", s1.charAt(count));
		
		// copy characters from string into charArray
		s1.getChars(0, 5, charArray, 0);
		System.out.print("\nThe character array is: ");
		
		for (char character : charArray)
			System.out.print(character);
		
		System.out.println();

	}

}
