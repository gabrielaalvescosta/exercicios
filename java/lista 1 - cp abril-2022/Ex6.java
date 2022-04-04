package lista1;

import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double dolar, reais;
		
		System.out.printf("Digite o valor em dólares: ");
		dolar = ler.nextDouble();
		
		reais = 5.7 * dolar;
		
		System.out.printf("O valor em reais é de R$" + reais + ".");
		
		ler.close();

	}

}