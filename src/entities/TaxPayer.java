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
		double monthlySalary = salaryIncome / 12.0;
		double incomeTax;
		
		if (monthlySalary < 3000.00){
			incomeTax = 0.0;
		}
		else if (monthlySalary < 5000.00) {
			 incomeTax = 12 * (monthlySalary * 0.1);
		}
		else {
			incomeTax = 12 * (monthlySalary * 0.2);
		}
		
		return incomeTax;
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
		
		double expenses = healthSpending + educationalSpending;
		double rebateLimit = 0.3 * grossTax();
		double rebate;
		
		if ( expenses < rebateLimit) {
			rebate = expenses;
		}
		else {
			rebate = rebateLimit;
		}
		
		return rebate;
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
	
}
