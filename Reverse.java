/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String input = args [0];
		String reverse = "";

		for (int num = input.length() - 1; num >=0; num--) {
			reverse += input.charAt(num);
		}
		System.out.println(reverse);
		Character middle = input.charAt((input.length()-1)/2);
		System.out.println("The middle character is " + middle);
	}
}
