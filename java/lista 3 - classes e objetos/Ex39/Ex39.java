package exercicio39;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/*
 *  Crie um sistema para o Banco Macgyver. 
 *  O sistema deverá permitir o cadastro de clientes e criação de conta. 
 *  Além disso, o usuário poderá realizar depósitos, saques e  transferências entre clientes. 
 *  Implemente também validações em seu sistema, por exemplo: 
 *  Não permitir realizar saques ou transferências se o cliente não ter saldo suficiente, etc.
 */


public class Ex39 {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
	       
	        int opcao;
	        int id;
	        String nome;
	        int idade;
	        String email;
	        ContaBancaria conta;
	    	String agencia;
	    	String numero;
	    	Double saldo;
	    	
				do {        
		            System.out.printf("===> Sistema de Cadastro de Cliente! <===\n\n");
		            System.out.printf("Escolha uma opção:\n");
		            System.out.printf("1 - Incluir Cliente \n" +
		                              "2 - Atualizar Cliente \n" +
		                              "3 - Excluir Cliente \n" +
		                              "4 - Exibir Cliente \n" +
		                              "5 - Sair\n\n");
		            System.out.printf("Digite a opção desejada: ");
		            opcao = ler.nextInt();
		           
		            if (opcao == 1) {
		                Cliente cliente = new Cliente();
		               
		                id = listaClientes.size() + 1;
		                cliente.setId(id);
		               
		                System.out.printf("\nDigite o nome do cliente: ");
		                nome = ler.next();
		                cliente.setNome(nome);
		               
		                System.out.printf("Digite a idade do cliente: ");
		                idade = ler.nextInt();
		                cliente.setIdade(idade);
		                
		                System.out.printf("Digite o email do cliente: ");
		                email = ler.next();
		                cliente.setEmail(email);
		                
		                System.out.printf("Possui Conta Bancária?\n");
		                System.out.printf("1 - Sim \n" +
		                                  "2 - Não \n");
		                System.out.printf("Digite a opção desejada: ");
		                opcao = ler.nextInt();
		                
		                if(opcao == 2) {
		                	System.out.printf("Quer cadastrar Conta Bancária?\n");
		                    System.out.printf("1 - Sim \n" +
		                                      "2 - Não \n");
		                    System.out.printf("Digite a opção desejada: ");
		                    opcao = ler.nextInt();
		                    
		                    if(opcao == 1) {
		                    	System.out.printf("\nDigite a agência do cliente: ");
		                        agencia = ler.next();
		                        cliente.getConta().setAgencia(agencia);
		                       
		                        System.out.printf("Digite o número da conta do cliente: ");
		                        numero = ler.next();
		                        cliente.getConta().setNumero(numero);
		                        
		                        System.out.printf("Digite o saldo da conta do cliente: ");
		                        saldo = ler.nextDouble();
		                        cliente.getConta().setSaldo(saldo);
		                    }
		                	
		                }
		                           
		                listaClientes.add(cliente);
		               
		                System.out.printf("Cliente incluído com sucesso!");
		                System.in.read();
		            }
		            else if (opcao == 2) {
		                for(Cliente cliente: listaClientes) {
		                    System.out.printf("ID: %d - Nome: %s - Agencia: %s - Número: %s - Saldo: %d \n", cliente.getId(), cliente.getNome(), cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
		                }
		               
		                System.out.printf("\nDigite o id do cliente que deseja atualizar: ");
		                id = ler.nextInt();
		               
		                System.out.printf("Digite o novo nome do cliente: ");
		                nome = ler.next();
		                
		                System.out.printf("Digite a agencia do cliente: ");
		                agencia = ler.next();
		               
		                System.out.printf("Digite o número da conta do cliente: ");
		                numero = ler.next();
		                
		                System.out.printf("Digite o saldo da conta do cliente: ");
		                saldo = ler.nextDouble();
		                
		                Cliente cliente = listaClientes.get(id-1);
		               
		                cliente.setNome(nome);
		                cliente.getConta().setAgencia(agencia);
		                cliente.getConta().setNumero(numero);
		                cliente.getConta().setSaldo(saldo);
		               
		                System.out.printf("Cliente atualizado com sucesso!");
		                System.in.read();                
		            }
		            
		            else if (opcao == 3) {
		                for(Cliente cliente: listaClientes) {
		                	System.out.printf("ID: %d - Nome: %s - Agencia: %s - Número: %s - Saldo: %d \n", cliente.getId(), cliente.getNome(), cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
		                }
		               
		                System.out.printf("\nDigite o id do cliente para exclusão: ");
		                id = ler.nextInt();
		 
		                listaClientes.remove(id-1);
		               
		                System.out.printf("Cliente excluído com sucesso!");
		                System.in.read();
		            }
		            
		            else if (opcao == 4) {
		            	for(Cliente cliente: listaClientes) {
		                	System.out.printf("ID: %d - Nome: %s - Agencia: %s - Número: %s - Saldo: %d \n", cliente.getId(), cliente.getNome(), cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
		                }
		            	
		                System.in.read();
		            }


		        }while(opcao != 5);
		
	}

}
