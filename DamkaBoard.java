/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);
		for (int row = 0; row < num; row ++) {
			String space = "";
			if (row % 2 == 1) {
				space = " *";
			}	
			else {
				space = "* ";
			}
			for (int l = 0; l < num; l++) {
				System.out.println(space);
			}
			System.out.println("");
		}
	}
}
