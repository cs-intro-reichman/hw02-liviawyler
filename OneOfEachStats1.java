/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */

 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int totalChildren = 0;
        int twoChildrenCount = 0;
        int threeChildrenCount = 0;
        int fourOrMoreChildrenCount = 0;
		String firstMostCommon = "";
		for  (int i = 0; i < T; i++) {
			int childrenCount = 0;
			boolean boyBorn = false;
			boolean girlBorn = false;
			while (!(boyBorn && girlBorn)) {
				 if (Math.random() < 0.5) {
					boyBorn = true;
				} else {
					girlBorn = true;
				}
				childrenCount++;
			}
			totalChildren = totalChildren + childrenCount;
			if (childrenCount == 2) {
				twoChildrenCount ++;
				firstMostCommon = firstMostCommon.concat("2");
			}
			if (childrenCount == 3) {
				threeChildrenCount ++;
				firstMostCommon = firstMostCommon.concat("3");
			}
			if (childrenCount > 3) {
				fourOrMoreChildrenCount ++;
				firstMostCommon = firstMostCommon.concat("4");
			}
		}
		
		System.out.println("Average: "+ (double) totalChildren/T + " children to get at least one of each gender");
		System.out.println("Number of families with two children: " + twoChildrenCount);
		System.out.println("Number of families with three children: " + threeChildrenCount);
		System.out.println("Number of families with four or more children: " + fourOrMoreChildrenCount);
		if ((twoChildrenCount > threeChildrenCount && twoChildrenCount > fourOrMoreChildrenCount) || (firstMostCommon.charAt(0) == '2') ){
			System.out.println("The most common number of children is 2.");
		}
		else if ( (threeChildrenCount > twoChildrenCount && threeChildrenCount > fourOrMoreChildrenCount) || (firstMostCommon.charAt(0) == '3') ) {
			System.out.println("The most common number of children is 3." );
		}		
		else if ((fourOrMoreChildrenCount > threeChildrenCount &&  fourOrMoreChildrenCount > twoChildrenCount) || (firstMostCommon.charAt(0) == '4' ) ) 
		{
			System.out.println("The most common number of children is 4 or more." );
		}
		
		
		
	}
}
	}
}
