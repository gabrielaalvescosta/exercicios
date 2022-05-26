package exercicio38;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/*
 * Crie um sistema com as classes conforme o Diagrama de Classe (UML) abaixo. 
 * Crie Getters e Setters para todos os atributos das classes. 
 * Crie um programa que utilize essas classes para cadastrar 5 produtos em uma lista de produtos 
 * e pergunte para cada produto se ele tem ou não uma categoria. 
 * Caso o produto tenha, permita ele cadastrar os dados da categoria. 
 * Ao final, exibir todos os produtos e suas respectivas categorias, se houver.
 */

public class Ex38 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Produto> listaProdutos = new ArrayList<>();
	
		
		Produto produto = null;
		Categoria categoria = null;
		
		int idProduto;
		String nomeProduto;
		double precoProduto;
		double quantidadeProduto;
		int idCategoria;
		String nomeCategoria;
		char respostaCategoria;

		
		
		for (int i = 0; i <= 4; i++) {
			
			Produto p = new Produto();
			
			System.out.printf("Digite o id: ");
			idProduto = ler.nextInt();
			p.setId(idProduto);
			
			System.out.printf("Digite o nome: ");
			nomeProduto = ler.next();
			p.setNome(nomeProduto);
			
			System.out.printf("Digite o preco: ");
			precoProduto = ler.nextDouble();
			p.setPreco(precoProduto);
			
			System.out.printf("Digite a quantidade: ");
			quantidadeProduto = ler.nextDouble();
			p.setQuantidade(quantidadeProduto);
			
			System.out.printf("O produto tem categoria? S/N ");
			respostaCategoria = ler.next().charAt(0);
			
			
			if (respostaCategoria == 's' || respostaCategoria == 'S') {
				
				categoria = new Categoria();
				
				System.out.printf("Digite o id da categoria: ");
				idCategoria = ler.nextInt();
				categoria.setId(idCategoria);
				
				
				System.out.printf("Digite o nome da categoria: ");
				nomeCategoria = ler.next();
				categoria.setNome(nomeCategoria);
				
				
			} else if (respostaCategoria == 'n' || respostaCategoria == 'N'){
				
				categoria = null;
			
			} else {
				System.out.printf("Dados inválidos.");				
			}
			

			produto = new Produto(idProduto, nomeProduto, precoProduto, quantidadeProduto, categoria);
			listaProdutos.add(produto);
		
	}
		
		for (Produto p: listaProdutos) {
			
			if (p.getCategoria() != null) {

				System.out.printf("ID %d - Nome: %s  \nCategoria: %s", p.getId(), p.getNome(), p.getCategoria());	

			} else {

				System.out.printf("ID %d - Nome: %s  \nCategoria: não possui", p.getId(), p.getNome());	

				
			}
				

		}
			ler.close();
}
	}

