package splitString;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Here we will learn to split a string using string tokenizer.
 */
public class SplitString {

	public SplitString() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String arg[]) {
		String strWithSpace = "JAVA Beginners Tutorial";
		String strWithDelimeter = "Hello |Hi |How";
		
		/*
		 * Constructs a string tokenizer for the specified string. The
		 * characters in the delim argument are the delimiters for separating
		 * tokens. Delimiter characters themselves will not be treated as
		 * tokens.
		 */
		StringTokenizer strToken = new StringTokenizer(strWithDelimeter, "|");
		
		/*
		 * Note: Space is the default token for the StringTokenizer.* 
		 */
		StringTokenizer strTokenSpace = new StringTokenizer(strWithSpace);
		
		System.out.println("Splitting the string on the basis of | tokens");
		while(strToken.hasMoreTokens()) {
			System.out.println(strToken.nextElement());
		}
		
		System.out.println("Splitting the string on the basis of Spaces");
		while(strTokenSpace.hasMoreTokens()) {
			System.out.println(strTokenSpace.nextElement());
		}
		
		System.out.println("Splitting the string using split function");
		splitString2 s2 = new splitString2();
		s2.splitStr();
		
		System.out.println("Splitting the string using Scanner Class");
		SplitString s3  = new SplitString();
		s3.strSplitScanner();
	}
	
	public void strSplitScanner() {
		String str = "JAVA Beginners Tutorial version 3";
		
		/*
		 * Scanner is a Class from java.util package. Constructs a new Scanner
		 * that produces values scanned from the specified string.
		 * useDelimiter() method is used to set this scanner's delimiting
		 * pattern to a pattern constructed from the specified String.
		 */
		Scanner scanner = new Scanner(str).useDelimiter(" ");
		
		/*
		 * We can directly use the next method to finds and returns the next
		 * complete token from this scanner. Return type would be String.
		 */
		while(scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		
		/*
		 * Scanner can also scan primitives along with Strings. And scanners
		 * have different method for different primitives type.
		 * Scans the next token of the input as a
		 * 1 - nextBigDecimal : BigDecimal
		 * 2 - nextBigInteger() : BigInteger
		 * 3 - nextBoolean() : Boolean
		 * 4 - nextByte() : Byte
		 * 5 - nextDouble() : Byte
		 * 6 - nextFloat() : Float
		 * 7 - nextInt() : Int
		 * ...
		 */
		
		System.out.println("Splitting the String and using Primitive Specific methods");
		String strAgain = "JAVA version 3 and 2 true";
		Scanner scannerAgain = new Scanner(strAgain).useDelimiter(" ");

		System.out.println(scannerAgain.next());
		System.out.println(scannerAgain.next());
		System.out.println(scannerAgain.nextInt());
		System.out.println(scannerAgain.next());
		System.out.println(scannerAgain.nextInt());
		System.out.println(scannerAgain.nextBoolean());
	}

}
