// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		// Replace this comment with your code
		String currentValue = args[0];
		String rate = args[1];
		String years = args[2];
		String result = "" + (Double.parseDouble(currentValue)
				* Math.pow(1 + Double.parseDouble(rate) / 100, Integer.parseInt(years)));
		double doubleNumber = Double.parseDouble(result);
		double roundedNumber =Math.round(doubleNumber);
		int finalResult = (int) roundedNumber;
		if (args != null) {
			System.out.println(
					"After " + years + " years, a $" + currentValue + " saved at " + rate + "%" + " will yield $"
							+ finalResult);
		}
	}
}