package lista2;

// Exibir a soma dos n�meros inteiros positivos do intervalo de um a cem.

public class Ex28 {

	public static void main(String[] args) {
		
		int soma = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			soma += i; 
			
		}
		
		System.out.printf("A soma de todos os n�meros de 1 a 100 � de %d", soma);

	}

}
