package functions;

public class BiggestNumber {
	
	public static int max(int a, int b, int c) {
		int aux;
		if (a > b && a > c) {
			aux = a;
		} else if (b > a && b > c) {
			aux = b;
		} else
			aux = c;
		return aux;
	}

}
