package lista1;

import java.util.Scanner;

public class Ex7 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double produto1, produto2, produto3, produto4, produto5, valor;
		
		System.out.printf("Digite o valor do primeiro produto: ");
		produto1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo produto: ");
		produto2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro produto: ");
		produto3 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto produto: ");
		produto4 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quinto produto: ");
		produto5 = ler.nextDouble();
		
		valor = produto1 + produto2 + produto3 + produto4 + produto5;
		
		System.out.printf("O valor total é de " + valor);
		
		ler.close();

	}

}