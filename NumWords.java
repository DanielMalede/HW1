// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		// Replace this comment with your code
		String number = args[0];
		if (number.length() == 4) {
			{
				System.out.println(number.charAt(0)+number.charAt(1) + " hundreds, " + number.charAt(2) + " tens, " + "and "
						+ number.charAt(3) + " ones.");
				return;
			}
		}
		if (number.length() == 3) {
			{
				System.out.println(number.charAt(0) + " hundreds, " + number.charAt(1) + " tens, " + "and "
						+ number.charAt(2) + " ones.");
				return;
			}
		}
		if (number.length() == 2) {
			{
				System.out
						.println("0 hundreds, " + number.charAt(0) + " tens, " + "and " + number.charAt(1) + " ones.");

				return;
			}
		}
		if (number.length() == 1) {
			{
				System.out
						.println("0 hundreds, " + "0 tens, " + " and " + number.charAt(0) + "ones.");
				return;
			}
		}
		System.out.println("Please enter a valid number between 1 and 999.");
	}
}
