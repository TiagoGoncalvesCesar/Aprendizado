package Exercicio_notas;

import java.util.Locale;
import java.util.Scanner;

public class Notas{

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			double primeiraNota;
			double segundaNota;
			double notaFinal;
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Digite a primeira nota:");
			primeiraNota = scan.nextDouble();
			System.out.print("Digite a segunda nota:");
			segundaNota = scan.nextDouble();
			
			notaFinal = primeiraNota + segundaNota;
			System.out.printf("NOTA FINAL = %.2f%n ", notaFinal);
			
			if (notaFinal < 60) {
			System.out.println("Reprovado");	
			}
			
			
		}

	}
