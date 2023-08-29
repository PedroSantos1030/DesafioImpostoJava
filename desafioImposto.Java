import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, servico, capital, medico, educacional, impostoSalario, salarioMes, impostoServico,
				impostoCapital, impostoTotal, abatimento, impostoDevido, gastos;

		System.out.print("Renda anual com salário: ");
		salario = sc.nextDouble();

		System.out.print("Renda anual com prestação de serviço: ");
		servico = sc.nextDouble();

		System.out.print("Renda anual com ganho de capital: ");
		capital = sc.nextDouble();

		System.out.print("Gastos médicos: ");
		medico = sc.nextDouble();

		System.out.print("Gastos educacionais: ");
		educacional = sc.nextDouble();

		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");

		System.out.println("CONSOLIDADO DE RENDA:");

		if (salario < 36000.0) {
			impostoSalario = 0.00;
		} else if (salario < 60000.0) {
			impostoSalario = salario * 0.10;
		} else {
			impostoSalario = salario * 0.20;
		}

		System.out.printf("Imposto sobre salário: %.2f", impostoSalario);

		impostoServico = 0.00;
		if (servico > 0.00) {
			impostoServico = servico * 0.15;
		}
		System.out.printf("Imposto sobre serviços: %.2f", impostoServico);

		impostoCapital = 0.00;
		if (capital > 0.00) {
			impostoCapital = capital * 0.20;
		}
		System.out.printf("Imposto sobre ganho de capital: %.2f", impostoCapital);

		System.out.print("DEDUÇÕES:");
		impostoTotal = impostoSalario + impostoServico + impostoCapital;
		abatimento = (impostoSalario + impostoServico + impostoCapital) * 0.30;
		gastos = medico + educacional;

		System.out.printf("Máximo Dedutível: %.2f", abatimento);
		System.out.printf("Gastos Dedutíveis: %.2f", gastos);

		System.out.println("RESUMO: ");
		System.out.printf("Imposto bruto total: %.2f", impostoTotal);

		if (abatimento > gastos) {
			System.out.printf("Abatimento: %.2f", gastos);
			System.out.printf("Imposto Devido: %.2f", impostoTotal - gastos);
		} else {
			System.out.printf("Abatimento: %.2f", abatimento);
			System.out.printf("Imposto Devido: %.2f", impostoTotal - abatimento);
		}

		sc.close();
	}
}
