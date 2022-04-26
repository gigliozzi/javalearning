package br.com.worker.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.worker.entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Department department;

	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department departmentName) {
		this.name = name;
		this.level = workerLevel;
		this.baseSalary = baseSalary;
		this.department = departmentName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) {
		Double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

	@Override
	public String toString() {
		return "\nWorker Data >\n"
				+ "name: " + name 
				+ "\nlevel: " + level 
				+ "\nbaseSalary: " + baseSalary 
				+ "\ndepartment: " + department;
	}
	
	
}