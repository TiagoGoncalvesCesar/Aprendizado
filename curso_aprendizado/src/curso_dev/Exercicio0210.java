package curso_dev;

import java.util.Scanner;
import  java.util.Locale;

public class Exercicio0210 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double largura;
		double comprimentoTerreno;
		double metroQuadrado;
		double areaTerreno;
		double precoTerreno;
		
		Scanner scan = new  Scanner(System.in);
		System.out.print("Digite a largura do terreno: ");
		largura = scan.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimentoTerreno = scan.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		metroQuadrado = scan.nextDouble();
		
		
		areaTerreno = largura * comprimentoTerreno;
		precoTerreno = comprimentoTerreno * metroQuadrado;
		
		Locale.setDefault(Locale.US);
		System.out.printf("area do terreno = %.2f%n" ,areaTerreno);
        System.out.printf("Preco do terreno = %.2f%n" ,precoTerreno); 
	}

}

       
        
        
        
        