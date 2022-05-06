package lista3;

import java.util.Scanner;

// Entrar via teclado com o sexo de determinado usu�rio, aceitar somente �F� ou �M� como respostas v�lidas.

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String sexo;
		
		do {
			
			System.out.printf("Digite F ou M para determinar o sexo: ");
			sexo = ler.next().toUpperCase();
			
		} while (sexo != "F" || sexo != "M");
		
		if (sexo == "F" || sexo == "M") {
			
			System.out.printf("O sexo foi definido como %c", sexo);
			
		} else {
			System.out.printf("Condicao inválida, tente novamente. ");
		}
		
		ler.close();
		
	}

}
