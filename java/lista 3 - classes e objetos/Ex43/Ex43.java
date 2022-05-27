package exercicio43;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * 
 * 43. Desenvolva um programa para controle de empréstimo de livros, com as classes Empréstimo, Livro e Pessoa. 
 * O programa deve permitir cadastrar pessoas, cadastrar livros, criar empréstimos e finalizar empréstimos com a devolução de livros. 
 * Crie o diagrama de classes para esse exercício.
 *
 */ 


public class Ex43 {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		ArrayList<Livro> listaLivros = new ArrayList<>();
		ArrayList<Emprestimo> listaEmprestimos = new ArrayList<>();
	       
	    int quantidade = 0;
	    
	    int opcao;
	    
	    // variaveis pessoa 
	    
	    int id;
	    String nome;
	    int idade;
	    String possuiEmail;
	    String email;
	    
		// variaveis livro
	    
	    String autor;
	    boolean disponivel;
	    
	    // variaveis emprestimo
	    
	    int idLeitor;
	 
	    
		
		do {        
		    System.out.printf("===> AGENDA <===\n\n");
		    System.out.printf("Escolha uma opção:\n");
		    System.out.printf("1 - Configurar cadastro de leitor \n" +
		                      "2 - Configurar cadastro de livros \n" +
		                      "3 - Novo emprestimo de livro \n" +
		                      "4 - Exibir e cancelar emprestimos de livros \n" +
		                      "5 - Sair\n\n");
		    
		    System.out.printf("Digite a opção desejada: ");
		    opcao = ler.nextInt();
		           
		    if (opcao == 1) {
		     
		    	Pessoa pessoa = new Pessoa();
		    	
		    	System.out.printf("Voce escolheu: Cadastro de LEITOR");
		               
		        id = listaPessoas.size() + 1;
		        pessoa.setId(id);
		               
		        System.out.printf("\nNome do leitor: ");
		        nome = ler.next();
		        pessoa.setNome(nome);
		               
		        System.out.printf("Idade do leitor:  ");
		        idade = ler.nextInt();
		        pessoa.setIdade(idade);
		                
		        System.out.printf("Seu contato possui email? (S/N) \n");
		        possuiEmail = ler.next().toUpperCase();
		        
		                
		        if(possuiEmail.equals("S")) {
		                	
		             System.out.printf("Digite o email do contato: ");
				     email = ler.next();
				     pessoa.setEmail(email);
				     
				     
		        } else {
		        	
		        	email = null;
		        	
		        }
		                           
		        
		        listaPessoas.add(pessoa);
		        quantidade += 1;
		        System.out.printf("Leitor incluído com sucesso!");
		        System.in.read();
		        
		        
		        } else if (opcao == 2) {
				     
		        	System.out.printf("Voce escolheu: Cadastro de LIVRO");
		        	
			    	Livro livro = new Livro();
			               
			        id = listaLivros.size() + 1;
			        livro.setId(id);
			               
			        System.out.printf("\nNome do livro: ");
			        nome = ler.next();
			        livro.setNome(nome);
			               
			        System.out.printf("\nNome do autor: ");
			        autor = ler.next();
			        livro.setAutor(autor);
			                           
			        disponivel = true;
			        livro.setStatus(disponivel);
			        
			        listaLivros.add(livro);
			        quantidade += 1;
			        System.out.printf("Livro incluído com sucesso!");
			        System.in.read();
			        
			        
			        } else if (opcao == 3) {
					     
			        
			        	System.out.printf("EMPRESTIMO DE LIVRO");
			        	
				    	Emprestimo emprestimo = new Emprestimo();
				               
				        id = listaEmprestimos.size() + 1;
				        emprestimo.setId(id);
				        
				        for (Pessoa p: listaPessoas) {
				        	
			        		System.out.printf("\nLEITORES\n Id: %d - Nome: %s ", p.getId(), p.getNome());
			        			
				        }
				
				               
				        System.out.printf("\nId do Leitor: ");
				        idLeitor = ler.nextInt();
				        emprestimo.setId(idLeitor);
				        
				        for (Livro l: listaLivros) {
				        	
			        		System.out.printf("\nLIVROS DISPONIVEIS\n Id: %d - Nome: %s ", l.getId(), l.getNome());
			        			
				        }
				
				               
				        System.out.printf("\nId do livro escolhido: ");
				        idLeitor = ler.nextInt();
				        emprestimo.setId(idLeitor);
				        
				        
				        emprestimo.getLivro().setStatus(false);
				   
				        listaEmprestimos.add(emprestimo);
				        quantidade += 1;
				        System.out.printf("Emprestimo liberado!");
				        System.in.read();
				        
				        
				        } else if (opcao == 4) {
				        	
		                
				        	for(Emprestimo e: listaEmprestimos) {
			        		
				        		System.out.printf("\nLIVROS EMPRESTADOS \n\nID: %d - Titulo: %s - Id do leitor: %d - Nome do leitor: %s", e.getId(), e.getLivro().getNome(), e.getPessoa().getId(), e.getPessoa().getNome());
			        			
			        		}
			            
					        System.out.printf("Digite o id do livro que deseja devolver: ");
					        id = ler.nextInt();
					      
							 
			                listaEmprestimos.remove(id-1);
			                
			                quantidade -= 1;
			               
			                System.out.printf("Livro devolvido com sucesso.");
			                System.in.read();
			        
				        }


		        } while(opcao != 5);
				
				ler.close();
	}
			

}
