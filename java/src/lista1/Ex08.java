package lista1;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.printf("Escolha o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.printf("Escolha o segundo número: ");
		num2 = ler.nextInt();
		
		if (num1 > num2) {
		
			System.out.printf("O número " + num1 + " é maior.", num1);
			
		} else {
			System.out.printf("O número " + num2 + " é maior.", num2);
		}
	}

}
