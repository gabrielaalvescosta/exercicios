package lista1;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
	
		double ladoA, ladoB, ladoC;
		
		System.out.printf("Digite o valor do cateto A: ");
		ladoA = ler.nextDouble();
		
		System.out.printf("Digite o valor do cateto B: ");
		ladoB = ler.nextDouble();
		
		System.out.printf("Digite o valor do cateto C: ");
		ladoC = ler.nextDouble();
		
		if(ladoC == Math.sqrt(Math.pow(ladoA, 2)) + Math.sqrt(Math.pow(ladoB, 2))) {
			System.out.printf("Este � um triangulo ret�ngulo!");
		} else {
			System.out.printf("Este n�o � um tri�ngulo ret�ngulo.");
		}
		
		ler.close();
		
	}

}
