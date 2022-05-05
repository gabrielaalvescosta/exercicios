package exercicio37;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;


/*
 * Crie um sistema com as classes conforme o Diagrama de Classe (UML) abaixo. 
 * Crie Getters e Setters para todos os atributos das classes. 
 * Crie um programa que utilize essas classes para cadastrar 5 clientes em uma lista de clientes 
 * e pergunte para cada cliente se ele tem ou não conta bancária. 
 * Caso o cliente tenha, permita ele cadastrar os dados da conta bancária. 
 * Ao final, exibir todos os clientes e suas respectivas contas bancárias, se houver.
 */


public class Ex37 {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		
		int id;
		String nome;
		int idade;
		String email;
		String agencia;
		String numero;
		double saldo;
		char resposta;

		for (int i = 0; i <= 4; i ++) {
			
			
			Cliente cliente = new Cliente();
			
	        id = listaClientes.size() + 1;
	        cliente.setId(id);
			
			System.out.printf("Digite o nome: ");
			nome = ler.next();
			cliente.setNome(nome);
			
			System.out.printf("Digite a idade: ");
			idade = ler.nextInt();
			cliente.setIdade(idade);
			
			System.out.printf("Digite o email: ");
			email = ler.next();
			cliente.setEmail(email);
			
			System.out.printf("Tem conta bancária? S/N");
			resposta = ler.next().charAt(0);
			
			if (resposta == 'S' || resposta == 's') {
				
				ContaBancaria conta = new ContaBancaria();
				
				System.out.printf("Digite a agencia: ");
				agencia = ler.next();
				conta.setAgencia(agencia);
				
				System.out.printf("Digite o numero: ");
				numero = ler.next();
				conta.setNumero(numero);
				
				System.out.printf("Digite o saldo: ");
				saldo = ler.nextDouble();
				conta.setSaldo(saldo);
				
				cliente = new Cliente(id, nome, idade, email, conta);
				
			} else {
				
				cliente = new Cliente(id, nome, idade, email, null);
				
			}
			
			listaClientes.add(cliente);
		}
		

			
			for (Cliente c: listaClientes) {
				
				if (c.getConta() != null) {

					System.out.printf("ID %d - Nome: %s  \nDados bancarios: %s - %s", c.getId(), c.getNome(), c.getContaEagencia());	

				} else {

					System.out.printf("ID %d - Nome: %s  \nNão possui conta bancária", c.getId(), c.getNome());	

					
				}
					

			}

		
		ler.close();

	}

}
