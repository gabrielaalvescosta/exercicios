package lista1;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.printf("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
		
		System.out.printf("Digite o segundo n�mero: ");
		num2 = ler.nextInt();
		
		System.out.printf("Digite o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.printf("O n�mero maior �: " + num1, num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.printf("O n�mero maior �: " + num2, num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.printf("O n�mero maior �: " + num3, num3);
		}

	}

}
