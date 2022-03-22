package entities;

public class Employee {
	public String name;
	public double salarioBruto;
	public double tax;

	public double netSalary() {
		return salarioBruto - tax;
	}

	public void increaseSalary(double percentage) {
		salarioBruto *= salarioBruto * percentage / 100;
		
	}

	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());

	}

}