package lista1;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double prova1, prova2, media, falta;
		
		System.out.printf("Nota da prova 1: ");
		prova1 = ler.nextDouble();
		
		System.out.printf("Nota da prova 2: ");
		prova2 = ler.nextDouble();
		
		media = (prova1 + (2 * prova2)) / 3;
		
		falta = (3 * media) - prova1 / 2;
		
		if (media >= 5) {
			System.out.printf("Aluno APROVADO", media);
		} else {
			System.out.printf("Aluno REPROVADO. Falta " + falta + " para se alcançar a média mínima", falta);
		}
		
		ler.close();

	}

}
