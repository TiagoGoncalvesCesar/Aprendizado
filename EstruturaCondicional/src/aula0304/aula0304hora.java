package aula0304;

import java.util.Scanner;

public class aula0304hora {

	public static void main(String[] args) {
		int horas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas hora?");
		horas = sc.nextInt();
		
		if (horas < 12) {
		   System.out.println("Bom dia");
		}
		
		
		else {
			if ( horas < 18){
				System.out.println("Boa tarde");
			}
			else  {
		       System.out.println("Boa noite");
			}
		}
	
		sc.close();
	}
}
	
	
