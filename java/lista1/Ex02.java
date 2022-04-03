package lista1;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		altura = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc < 20) {
			System.out.printf("Seu imc é %1f. Portanto, você está abaixo do peso.", imc);
		} else if (imc >= 20 && imc <= 25) {
			System.out.printf("Seu imc é %1f. Portanto, você está no peso ideal", imc);
		} else {
			System.out.printf("Seu imc é %1f. Portanto, você está acima do peso", imc);
		}
		
		ler.close();
		
	}

}
