/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int perfectNum = Integer.parseInt(args[0]);
		int store = 1;
		String perfect = perfectNum + " is a perfect number since " + perfectNum + " = 1";
		for (int x = 2; x < perfectNum; x ++) {
			if (perfectNum % x == 0) {
				store += x;
				perfect += " + " + x;
				
			}
		}
		if (store == perfectNum){
			System.out.println(perfect);

		}
		else {
			System.out.println(perfectNum + " is not a perfect number");
		}
	}
}
