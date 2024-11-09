// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		// Replace this comment with your code
		String currentValue = args[0];
		String rate = args[1];
		String years = args[2];
		String result = "" + (Double.parseDouble(currentValue)
				* Math.pow(1 + Double.parseDouble(rate) / 100, Integer.parseInt(years)));
		double doublenumber = Double.parseDouble(result);
		int intNumber = (int) Math.floor(doublenumber);
		// int intResult = Math.floor(downNum)
		String division = "" + Double.parseDouble(currentValue) / Double.parseDouble(rate);
		if (args != null) {

			System.out.println(result + " " + division);
			System.out.println(
					"After " + years + " years, " + currentValue + " saved at " + division + "%" + " will yield $"
							+ intNumber);
		}
	}
}