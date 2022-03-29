package lista1;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.printf("Digite o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.printf("Digite o segundo número: ");
		num2 = ler.nextInt();
		
		System.out.printf("Digite o terceiro número: ");
		num3 = ler.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.printf("O número maior é: " + num1, num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.printf("O número maior é: " + num2, num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.printf("O número maior é: " + num3, num3);
		}

	}

}
