package exercicio36;

import java.util.Scanner;

/*
 * Crie as classes conforme o Diagrama de Classe (UML) abaixo. 
 * Crie Getters e Setters para todos os atributos das classes. 
 * Crie um programa que utilize essas classes para cadastrar 5 produtos em uma lista de produtos 
 * e pergunte para cada produto se ele tem ou não uma categoria. 
 * Caso o produto tenha, permita ele cadastrar os dados da categoria. 
 * Ao final, exibir todos os produtos e suas respectivas categorias, se houver.
 */


public class Ex36 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Produto[] listaProdutos = new Produto[5];
		
		int id;
		String nome;
		double preco;
		double quantidade;
		Categoria categoria;
		
		for (int i = 0; i <= 4; i++) {
			
			Produto produto = new Produto();
			
			System.out.printf("Digite o id: ");
			id = ler.nextInt();
			produto.setId(id);
			
			System.out.printf("Digite o nome: ");
			nome = ler.next();
			produto.setNome(nome);
			
			System.out.printf("Digite o preco: ");
			preco = ler.nextDouble();
			produto.setPreco(preco);
		}
		
		
	}

}
