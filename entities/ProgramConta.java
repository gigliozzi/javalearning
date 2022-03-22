package entities;

import java.util.Locale;
import java.util.Scanner;


public class ProgramConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta;

		System.out.print("Informe o numero da conta: ");
		int numConta = sc.nextInt();

		System.out.print("Informe o titular: ");
		sc.nextLine();	
		String nomeTitular = sc.nextLine();
			

		System.out.print("Tem depósito inicial? (y/n) ");
		char resp = sc.next().charAt(0);
		if (resp == 'y') {
			System.out.print("Entre c valor: \n");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numConta, nomeTitular, depositoInicial);
		} else {
			conta = new Conta(numConta, nomeTitular);
		}
		
		System.out.println();System.out.println();
		System.out.println("Dados atualizados:");
		System.out.println(conta);
		System.out.println();

		System.out.print("Informe o depósito:");
		double valor = sc.nextDouble();
		conta.deposita(valor);
		System.out.println();

		System.out.println("Dados atualizados:");
		System.out.println(conta);

		System.out.println("Informe o saque:");
		valor = sc.nextDouble();
		conta.saca(valor);
		System.out.println();

		System.out.println("Dados atualizados:");
		System.out.println(conta);

		sc.close();
	}

}
