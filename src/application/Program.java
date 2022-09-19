package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos contribuintes você vai digitar?");
		int n =sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		TaxPayer tp;
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Digite os dados do "+ i +"o contribuinte:");
			System.out.println();
			System.out.print("Renda anual com salário:");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço:");
			double serviceIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital:");
			double capitalIncome = sc.nextDouble();
			
			System.out.print("Gastos médicos:");
			double healthSpendidng = sc.nextDouble();
			System.out.print("Gastos educacionais:");
			double educationalSpending = sc.nextDouble();
			
			tp = new TaxPayer(salaryIncome, serviceIncome, capitalIncome, healthSpendidng, educationalSpending);
			list.add(tp);
			
			System.out.println();
			System.out.println("Resumo do " + i +"o Contribuinte:");
			System.out.print("Imposto Bruto total: " + String.format("%.2f", tp.grossTax()));
			System.out.print("\nAbatimento: " + String.format("%.2f", tp.taxRebate()));
			System.out.println();
		}
		
		
	}

}