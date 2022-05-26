package exercicio41;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * 
 * 41. Desenvolva um programa de Agenda Telefônica, com as classes Agenda e Contato.
 * O programa deve permitir, incluir, alterar, excluir e listar os contatos da agenda.  
 * Crie o diagrama de classes para esse exercício.
 *
 */


public class Ex41 {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Contato> listaContatos = new ArrayList<>();
	       
	    int id;
	    int quantidade = 0;
	    String nome;
	    int opcao;
	    String numero;
	    String possuiEmail;
	    String email;
		
		
		do {        
		    System.out.printf("===> AGENDA <===\n\n");
		    System.out.printf("Escolha uma opção:\n");
		    System.out.printf("1 - Criar contato \n" +
		                      "2 - Alterar Contato \n" +
		                      "3 - Excluir Contato \n" +
		                      "4 - Exibir Contato \n" +
		                      "5 - Sair\n\n");
		    
		    System.out.printf("Digite a opção desejada: ");
		    opcao = ler.nextInt();
		           
		    if (opcao == 1) {
		     
		    	Contato contato = new Contato();
		               
		        id = listaContatos.size() + 1;
		        contato.setId(id);
		               
		        System.out.printf("\nDigite o nome do contato: ");
		        nome = ler.next();
		        contato.setNome(nome);
		               
		        System.out.printf("Digite o número: ");
		        numero = ler.next();
		        contato.setNumero(numero);
		                
		        System.out.printf("Seu contato possui email? (S/N) \n");
		        possuiEmail = ler.next().toUpperCase();
		                
		        if(possuiEmail.equals("S")) {
		                	
		             System.out.printf("Digite o email do contato: ");
				     email = ler.next();
				     contato.setEmail(email);
		                   
		        } else {
		        	
		        	email = null;
		        	
		        }
		                           
		        
		        listaContatos.add(contato);
		        quantidade += 1;
		        System.out.printf("Cliente incluído com sucesso!");
		        System.in.read();
		        
		        
		        } else if (opcao == 2) {
		             
		        	for(Contato contato: listaContatos) {
		        		
		                System.out.printf("ID: %d - Nome: %s - Número: %s - Email: %s", contato.getId(), contato.getNome(), contato.getNumero(), contato.getEmail());
		            
		        	}
		               
			        System.out.printf("\nDigite o id do contato: ");
			        id = ler.nextInt();
	
			      
			        System.out.printf("Digite o novo número do contato: ");
			        numero = ler.next();
			        
			        System.out.printf("Digite o novo email do contato: ");
			        email = ler.next();
			                
			        Contato contato = listaContatos.get(id -1);
			        
			        contato.setNumero(numero);
			        contato.setEmail(email);
			       
		            System.out.printf("Contato atualizado com sucesso!");
		            System.in.read();
		                
		            }
		            
		            else if (opcao == 3) {
		                
			        	for(Contato contato: listaContatos) {
			        		
			                System.out.printf("ID: %d - Nome: %s - Número: %s - Email: %s", contato.getId(), contato.getNome(), contato.getNumero(), contato.getEmail());
			            
			        	}
		               
		                System.out.printf("\nDigite o id do contato que deseja excluir: ");
		                id = ler.nextInt();
		 
		                listaContatos.remove(id-1);
		                quantidade -= 1;
		               
		                System.out.printf("Cliente excluído com sucesso!");
		                System.in.read();
		            }
		            
		            else if (opcao == 4) {

			        	for(Contato contato: listaContatos) {
			        		
			                System.out.printf("ID: %d - Nome: %s - Número: %s - Email: %s", contato.getId(), contato.getNome(), contato.getNumero(), contato.getEmail());

			        	}
		            	
		                System.in.read();
		            }


		        } while(opcao != 5);
				
				ler.close();
	}
			

}
