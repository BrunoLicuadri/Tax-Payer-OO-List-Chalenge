package entities;

public class TaxPayer {
	private double salaryIncome;
	private double serviceIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationalSpending;
	
	public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healthSpending,
			double educationalSpending) {
		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationalSpending = educationalSpending;
	}
	public double getSalaryIncome() {
		return salaryIncome;
	}
	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}
	public double getServiceIncome() {
		return serviceIncome;
	}
	public void setServiceIncome(double serviceIncome) {
		this.serviceIncome = serviceIncome;
	}
	public double getCapitalIncome() {
		return capitalIncome;
	}
	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}
	public double getHealthSpending() {
		return healthSpending;
	}
	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}
	public double getEducationalSpending() {
		return educationalSpending;
	}
	public void setEducationalSpending(double educationalSpending) {
		this.educationalSpending = educationalSpending;
	}
	
	
	public double salaryTax() {
		salaryIncome /= 12;
		if (salaryIncome >=3000.00){
			return salaryIncome * 0.1;
		}
		else if (salaryIncome >=5000.00) {
			return salaryIncome * 0.2;
		}
		else {
			return 0.0;
		}
	}
	
	public double serviceTax() {
		return serviceIncome * 0.15;
	}
	
	public double capitalTax() {
		return capitalIncome * 0.2;
	}
	
	public double grossTax() {
		return salaryTax() + serviceTax() + capitalTax(); 
	}
	
	public double taxRebate() {
		if (healthSpending + educationalSpending < grossTax() * 0.3) {
			return healthSpending + educationalSpending;
		}
		else {
			return grossTax() * 0.3;
		}
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
	
}
