
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach{
	public static void main (String[] args) {
		//// Put your code here
		int sumChildrenCount = 0;
		boolean boy = false;
		boolean girl = false; 
		while (!(boy && girl)) {
			if (Math.random() < 0.5) {
				System.out.print("b "); // Print 'b' for boy
				boy = true;
			}
			else {
				System.out.print("g "); // Print 'g' for girl
				girl = true;
			}
			sumChildrenCount++;
		}
		System.out.println("\nYou made it... and you now have "+ sumChildrenCount+ " children.");
		
	}
}


		