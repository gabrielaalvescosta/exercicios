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
		int idCategoria;
		String nomeCategoria;
		char resposta;
		
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
			
			System.out.printf("Digite a quantidade: ");
			quantidade = ler.nextDouble();
			produto.setQuantidade(quantidade);
			
			System.out.printf("O produto tem categoria? S/N ");
			resposta = ler.next().charAt(0);
			
			if (resposta == 's' || resposta == 'S') {
				
				categoria = new Categoria();
				
				System.out.printf("Digite o id da categoria: ");
				idCategoria = ler.nextInt();
				categoria.setId(idCategoria);
				
				
				System.out.printf("Digite o nome da categoria: ");
				nomeCategoria = ler.next();
				categoria.setNome(nomeCategoria);
				
				
				
			} else {
				
				categoria = null;
			}
			

			produto = new Produto(id, nome, preco, quantidade, categoria);
			listaProdutos[i] = produto;
			
		}
		
        for (int i = 0; i <= 4; i++) {
            System.out.printf("\nProduto %d criado com sucesso (%s)!", listaProdutos[i].getId(), listaProdutos[i].getNome());
        }

		
		
		ler.close();
		
	}

}
