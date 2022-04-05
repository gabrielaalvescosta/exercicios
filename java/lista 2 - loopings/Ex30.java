package lista2;


// Exibir os vinte primeiros valores da série de Bergamaschi. A série: 1, 1, 1, 3, 5, 9, 17, ...

public class Ex30 {

	public static void main(String[] args) {
		
		int n1 = 1;
		int n2 = 1;
		int n3 = 1;
		int n4 = n3 + n2 + n1;
		
		for (int i = 0; i <= 20; i++) {
			
			int n5 = n4 + n3 + n2;
		    n3 = n4;
		    n2 = n3;
		    System.out.printf("\n %d", n5);
		}
		

	}

}
