package lista1;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double catetoA, catetoB, hipotenusa;
		
		System.out.printf("Digite o valor do cateto A: ");
		catetoA = ler.nextDouble();
		
		System.out.printf("Digite o valor do cateto B: ");
		catetoB = ler.nextDouble();
		
		System.out.printf("Digite o valor do hipotenusa: ");
		hipotenusa = ler.nextDouble();
		
		if (catetoA != 0 && catetoB != 0 && hipotenusa != 0)
			
			if (catetoA == catetoB && catetoA == hipotenusa) {
				System.out.printf("Este triângulo é equilátero");
			} else if (catetoA == catetoB && catetoA != hipotenusa) {
				System.out.printf("Este triângulo é isósceles");
			} else if (catetoA != catetoB && catetoA != hipotenusa && hipotenusa != catetoB) {
				System.out.printf("Este triângulo é escaleno");
			}
		
		ler.close();
		
	}
	
}
