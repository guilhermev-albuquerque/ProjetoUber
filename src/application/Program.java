package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Login;
import entities.Motorista;
import entities.Usuario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Usuario usuario = new Usuario();
		
		System.out.println("Bem-vindo ao nosso App");
		System.out.print("Digite 1 para realizar o login ou 2 para fazer o cadastro: ");
		char ch = sc.next().charAt(0);
		
		if (ch == '2') {
			System.out.println("Para fazer o cadastro basta seguir os passos a seguir.");
			System.out.print("Nos diga seu nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Nome de usuário (necessário para fazer o login): ");
			String nomeUsuario = sc.nextLine();
			System.out.print("Sua idade: ");
			int idade = sc.nextInt();
			System.out.print("Seu CPF (apenas números): ");
			int cpf = sc.nextInt();
			System.out.print("E-mail: ");
			sc.nextLine();
			String email = sc.nextLine();
			System.out.print("E por fim sua senha: ");
			String senha = sc.nextLine();
			
			usuario = new Usuario(nome, nomeUsuario, cpf, idade, email, senha);
			
			System.out.println("Cadastro do usuário " + usuario.getNome() + " feito com sucesso");
			
			
		} else if (ch == '1') {
			System.out.println("Tela de login.");
			System.out.print("Nome de usuário: ");
			sc.nextLine();
			String nomeUsuario = sc.nextLine();
			System.out.print("Senha: ");
			String senha = sc.nextLine();
			
			Login login = new Login(nomeUsuario, senha);
			
			if (nomeUsuario.equals(login.getNomeUsuario()) && senha.equals(login.getSenha())) {
				System.out.println("Login do " + usuario.getNome() + "efetuado");
				
			}
			
			
			
		} else {
			System.out.println("Opção inválida");
		}
		
		
		
		
		sc.close();

	}

}
