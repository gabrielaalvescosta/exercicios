package lista1;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double velocInicial, velocidade, aceleracao, tempo, velocidadeFinal;
		
		System.out.printf("Digite a velocidade inicial em m/s: ");
		velocInicial = ler.nextDouble();
		
		System.out.printf("Digite o tempo em segundos: ");
		tempo = ler.nextDouble();
		
		System.out.printf("Digite a aceleração em m/s²: ");
		aceleracao = ler.nextDouble();
		
		velocidade = velocInicial + (aceleracao * tempo);
		
		velocidadeFinal = velocidade * 3.6;
		
		if (velocidadeFinal <= 40) {
			System.out.printf("Veículo muito lento.", velocidadeFinal);
		} else if (velocidadeFinal > 40 && velocidadeFinal <= 60) {
			System.out.printf("Velocidade permitida", velocidadeFinal);
		} else if (velocidadeFinal > 60 && velocidadeFinal <= 80) {
			System.out.printf("Velocidade de cruzeiro", velocidadeFinal);
		} else if (velocidadeFinal > 80 && velocidadeFinal <= 80) {
			System.out.printf("Veículo rápido", velocidadeFinal);
		} else if (velocidadeFinal > 120) {
			System.out.printf("Veículo muito rápido.", velocidadeFinal);
		}
		
		ler.close();
		
	}

}
