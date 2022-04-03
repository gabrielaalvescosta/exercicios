package lista2;

import java.util.Scanner;

// Desenvolver um programa que solicite a digitação de um número de 1 a 4, após digitar o 
// número o programa deve dizer “Você escolheu X”. Caso o número seja diferente de 1, 2, 3 ou 4, 
// retornar a mensagem “Número inválido”.


public class Ex01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.printf("Digite um número: ");
		numero = ler.nextInt();
		
		switch(numero) {
		
		case 1:
			System.out.printf("Você escolheu o número 1", numero);
			break;
		case 2:
			System.out.printf("Você escolheu o número 2", numero);
			break;
		case 3:
			System.out.printf("Você escolheu o número 3", numero);
			break;
		case 4:
			System.out.printf("Você escolheu o número 4", numero);
			break;
			
		}
		
		ler.close();

	}

}
