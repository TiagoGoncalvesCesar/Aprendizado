package curso_dev;

import java.util.Scanner;

public class condiçao_ternaria {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double preco = 34.5;
		double desconto;
		
		if(preco < 20) {
			desconto = preco * 0.01;
		}
		else {
			desconto = preco * 0.05;
		}

		
		
		
		System.out.println(desconto);
		
	}

}
