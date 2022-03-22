package entities;

public class CurrencyConverter {

	public static double Conversion(double cotacao, double quant) {
		return quant * cotacao * 1.06;
	}
}
