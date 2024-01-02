
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
}
	public static void main (String[] args) {
		int childrenCount = 0;
		boolean boyBorn = false;
		boolean girlBorn = false; 
		while (!(boyBorn && girlBorn)) {
		} if (Math.random() < 0.5) {
			System.out.print("b "); // Print 'b' for boy
			boyBorn = true;
		} else {
			System.out.print("g "); // Print 'g' for girl
			girlBorn == true;
			}
		childrenCount++;
		}
		System.out.println("\nYou made it... and you now have "+ childrenCount + " children.");
	}
}