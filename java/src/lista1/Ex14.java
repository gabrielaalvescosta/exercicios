package lista1;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		altura = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc >= 20 && imc <= 25) {
			System.out.printf("Seu imc � %1f. Portanto, voc� est� no peso ideal", imc);
		} else {
			System.out.printf("Seu imc � %1f. Portanto, voc� est� fora do peso ideal", imc);
		}
		
		ler.close();
		
	}

}
