package lista1;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double celsius, farenheit;
		
		System.out.printf("Digite a temperatura em Celsius: ");
		celsius = ler.nextDouble();
		
		farenheit = (celsius * 1.8) + 32;
		
		System.out.printf("A temperatura em farenheit é de: " + farenheit + "F°");
		
		ler.close();

	}

}