package lessons;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double x = 3.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.1;
		
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		System.out.printf("%.5f\n", x);
		System.out.printf("%s tem %d anos tem renda de %.2f", nome, idade, renda);
		
	}

}
