/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int randomNum = (int) (Math.random()*(10-0+1)+0);
		int previous = 0;

		while (previous <= randomNum) {
			System.out.print(randomNum + " ");
			previous = randomNum;
			randomNum = (int) (Math.random()*(10-0+1)+0);

		}
	}
}
