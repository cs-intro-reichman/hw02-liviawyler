/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	// public static void main (String[] args) {
		//int divisor = Integer.parseInt(args[0]);
		// int divisor2 = 1++ ;
		// if (x % Divisor = 0);

     // System.out.println(Divisor);
	//  else {
		// if (x % Divisor = 0);
		// System.out.println(1);
		// System.out.println(Divisor);

    public static void main (String[] args) {
		int divisor = Integer.parseInt(args[0]);
		for (int x = 1; x <= divisor; x ++) {
			if (divisor % x == 0) {
				System.out.println(x);
			}
		}
	}
} 
