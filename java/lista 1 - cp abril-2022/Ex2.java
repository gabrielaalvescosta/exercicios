package lista1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double aresta, area;
		
		System.out.printf("Tamanho da aresta em cm: ");
		aresta = ler.nextDouble();
		
		area = aresta * aresta;
		
		System.out.printf("A �rea do quadrado � de " + area + "cm�", area);
		
		ler.close();

	}

}
