package beecrowd;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Beecrowd1024 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		String[] ascii = {"@","@","@","@","@","@","@","@","@","@",
				"@","@","@","@","@","@","@","@","@","@","@","@","@",
				"@","@","@","@","@","@","@","@","@","@","!","\"","A"};
		
		String entrada = "Essa frase tem seis LETRAS s.";
		 String regex = "[A-Z]";

	    Pattern padrao = Pattern.compile(regex);
	    Matcher matcher = padrao.matcher(entrada);
		
	    int correspondencias = 0;
	    while (matcher.find()) {
	      correspondencias++;
	    }
	    System.out.println(correspondencias); // 6

		
		for (int i = 33; i < ascii.length; i++) {
			System.out.println("posicao["+ i + "] "+ ascii[i]);
		}
		

		sc.close();
		
		
		
	}
}
