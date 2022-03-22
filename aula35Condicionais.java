import java.util.Scanner;

public class aula35Condicionais {

	public static void main(String[] args) {

		// leia uma hora do dia e imprima 'bom dia', 
		// 'boa tarde' ou 'boa noite' de acordo com a hora informada
		
		int hora;
		
		Scanner sc = new Scanner(System.in);
		
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("bom dia");
		} 
		else if (hora < 18) {
			System.out.println("boa tarde");
		}
		else {
			System.out.println("boa noite");
		}
		
		
		sc.close();

	}

}
