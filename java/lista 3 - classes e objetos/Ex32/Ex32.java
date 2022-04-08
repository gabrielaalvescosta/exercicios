package lista_classes;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Pessoa [] listaPessoas = new Pessoa[5];
		
		for (int i = 0; i <= 4; i++) {
			
			Pessoa p = new Pessoa();
			
			System.out.printf("Digite o id da pessoa: ");
			p.id = ler.nextInt();
			
			System.out.printf("Digite o nome da pessoa: ");
			p.nome = ler.next();
			
			System.out.printf("Digite a idade da pessoa: ");
			p.idade = ler.nextInt();
			
			System.out.printf("Digite o email da pessoa:");
			p.email = ler.next();
			
			listaPessoas[i] = p;
		}
			
		
		for (int i = 0; i <=4; i++) {
					
			if (listaPessoas[i].idade >= 18) {
				
					System.out.printf("\n As pessoas maiores de 18 anos são " + listaPessoas[i].nome);
					
				}
				
				
			}
		
			ler.close();
			
		}

	}

