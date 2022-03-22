package entities;

public class Conta {

	private int numConta;
	private String nomeTitular;
	private double saldo;

	Conta() {
	}

	Conta(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	Conta(int numConta, String nomeTitular, double depositoInicial) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		deposita(depositoInicial);
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public void saca(double valor) {
		saldo -= valor + 5.00;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Account " 
						+ numConta 
						+ ", Titular: " 
						+ nomeTitular
						+ " , Saldo: $"
						+ String.format("%.2f", saldo);
	}

	

}
