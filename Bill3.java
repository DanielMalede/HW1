// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
		// Replace this comment with the rest of your code
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		Double bill = Double.parseDouble(args[3]);

		Double billingSplit = bill / 3;
		billingSplit = Math.ceil(billingSplit);

		System.out.println("Dear " + name1 + ", " + name2 + ", " + name3 + ": pay " + billingSplit + " Shekels each.");
	}
}