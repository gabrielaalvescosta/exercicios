package lista2;


// Exibir os trinta primeiros valores da s�rie de Fibonacci. A s�rie: 1, 1, 2, 3, 5, 8, ...

public class Ex29 {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		
		for (int i = 0; i <= 30; i++) {
			
			   int n3 = n1 + n2;
	            n1 = n2;
	            n2 = n3;
	            System.out.printf("\n %d,", n1);
			
		}

	}

}
