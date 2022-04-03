package lista1;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc, sexo;
		
		System.out.printf("Digite o peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite a altura: ");
		altura = ler.nextDouble();
		
		System.out.printf("Digite o sexo (0 para masculino e 1 para feminino): ");
		sexo = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (sexo == 0) {
			if (imc < 20) {
				System.out.printf("Abaixo do peso.");
			} else if (imc >= 20 && imc < 25) {
				System.out.printf("Peso ideal.");
			} else {
				System.out.printf("Acima do peso.");
			}
		}
		
		if (sexo == 1) {
			if (imc < 19) {
				System.out.printf("Abaixo do peso.");
			} else if (imc >= 19 && imc < 24) {
				System.out.printf("Peso ideal.");
			} else {
				System.out.printf("Acima do peso.");
			}
			
			ler.close();
		}
	}

}
