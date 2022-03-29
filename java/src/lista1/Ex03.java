package lista1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite um número de 1 a 4: ");
		
		int numero = ler.nextInt();
		
		switch(numero) {
		
		case 1:
			System.out.printf("Você escolheu 1");
			break;
		case 2:
			System.out.printf("Você escolheu 2");
			break;
		case 3:
			System.out.printf("Você escolheu 3");
			break;
		case 4: 
			System.out.printf("Você escolheu 4");
			break;
		default:
			System.out.printf("Número inválido!");
		}
	}

}
