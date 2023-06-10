package Desafio_Imposto;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salarioMensal;
		double imposto;
		double Abatimento = 0;
		double rendaAnualSalario;
		double prestaçãoServiço;
		double ganhoCapital;
		double gastosMédicos;
		double gastosEducacionais;
		double impostoDevido;
		double impostoSalário = 0;
		double impostoServiços;
		double impostoGanhoCapital;
		double impostoBrutoTotal;
		double porcentagem;
		double máximoDedutível;
		double gastosDedutíveis;

		System.out.print("Renda anual com salário: ");
		rendaAnualSalario = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		prestaçãoServiço = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		ganhoCapital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gastosMédicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();

		salarioMensal = rendaAnualSalario / 12;

		if (salarioMensal < 3000) {
			porcentagem = 0;
			impostoSalário = rendaAnualSalario * porcentagem;
		} else if (salarioMensal >= 3000 && salarioMensal <= 5000) {
			porcentagem = 0.10;
			impostoSalário = rendaAnualSalario * porcentagem;
		} else if (salarioMensal > 5000) {
			porcentagem = 0.20;
			impostoSalário = rendaAnualSalario * porcentagem;
		}
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA:");

		System.out.println("Consolidado de Renda:");

		impostoServiços = prestaçãoServiço * 0.15;
		impostoGanhoCapital = ganhoCapital * 0.2;
		System.out.printf("Imposto sobre salário: %.2f%n", impostoSalário);
		System.out.printf("Imposto sobre serviço: %.2f%n", impostoServiços);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGanhoCapital);

		System.out.println("Deduções:");
		máximoDedutível = (impostoSalário + impostoServiços + impostoGanhoCapital) * 30 / 100;
		gastosDedutíveis = gastosMédicos + gastosEducacionais;
		System.out.printf("Máximo dedutível: %.2f%n", máximoDedutível);
		System.out.printf("Gastos dedutíves: %.2f%n", gastosDedutíveis);

		System.out.println("Resumo:");
		impostoBrutoTotal = impostoSalário + impostoServiços + impostoGanhoCapital;

		if (gastosDedutíveis > máximoDedutível) {
			Abatimento = máximoDedutível;
		} else {
			Abatimento = gastosDedutíveis;
		}

		impostoDevido = impostoBrutoTotal - Abatimento;

		System.out.printf("Imposto total bruto: %.2f%n", impostoBrutoTotal);
		System.out.printf("Abatimento: %.2f%n", Abatimento);
		System.out.printf("Imposto devido: %.2f%n", impostoDevido);
	}
}
