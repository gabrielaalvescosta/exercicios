package encapsulamento;

import java.util.Scanner;

/*
 * Crie as classes conforme o Diagrama de Classe (UML) abaixo. 
 * Crie Getters e Setters para todos os atributos das classes. 
 * Crie um programa que utilize essas classes para cadastrar 5 clientes em uma lista de clientes e 
 * pergunte para cada cliente se ele tem ou não conta bancária. 
 * Caso o cliente tenha, permita ele cadastrar os dados da conta bancária. 
 * Ao final, exibir todos os clientes e suas respectivas contas bancárias, se houver.
 */


public class Ex35 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Cliente[] listaCliente = new Cliente[5];
		
		int id;
		String nome;
		int idade;
		String email;
		char resposta;
		String agencia;
		String numero;
		double saldo;
		
		for (int i = 0; i <= 4; i++) {
			
			Cliente cliente = new Cliente();
			
			System.out.printf("Digite o id: ");
			id = ler.nextInt();
			cliente.setId(id);
			
			System.out.printf("Digite o nome: ");
			nome = ler.next();
			cliente.setNome(nome);
			
			System.out.printf("Digite a idade: ");
			idade = ler.nextInt();
			cliente.setIdade(idade);
			
			System.out.printf("Digite o email");
			email = ler.next();
			cliente.setEmail(email);
			
			System.out.printf("Tem conta bancária S/N");
			resposta = ler.next().charAt(0);
			
			if (resposta == 'S') {
				
				Conta conta = new Conta();
				
				System.out.printf("Digite a agencia: ");
				agencia = ler.next();
				conta.setAgencia();
				
			}
			
			
		}
		
		
		ler.close();

	}
	
	

}
