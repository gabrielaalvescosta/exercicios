package lista1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		
		double prova1, prova2, media;
		
		System.out.printf("Digite a nota Prova 1: ");
		prova1 = nota.nextDouble();
		
		System.out.printf("Digite a nota da Prova 2: ");
		prova2 = nota.nextDouble();
		
		media = (prova1 + prova2) / 2;
		
		if (media >= 5) {
			System.out.printf("A sua foi %.1f. Portanto, você está APROVADO(A)", media);
		} else {
			System.out.printf("A sua média foi de %.1f. Portanto, você está REPROVADO(A).", media);
		}
		
	}

}
