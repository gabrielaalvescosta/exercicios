package lista2;

import java.util.Scanner;

// Desenvolver um programa que solicite a digita��o de um n�mero de 1 a 4, ap�s digitar o 
// n�mero o programa deve dizer �Voc� escolheu X�. Caso o n�mero seja diferente de 1, 2, 3 ou 4, 
// retornar a mensagem �N�mero inv�lido�.


public class Ex01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.printf("Digite um n�mero: ");
		numero = ler.nextInt();
		
		switch(numero) {
		
		case 1:
			System.out.printf("Voc� escolheu o n�mero 1", numero);
			break;
		case 2:
			System.out.printf("Voc� escolheu o n�mero 2", numero);
			break;
		case 3:
			System.out.printf("Voc� escolheu o n�mero 3", numero);
			break;
		case 4:
			System.out.printf("Voc� escolheu o n�mero 4", numero);
			break;
			
		}
		
		ler.close();

	}

}
