package br.edu.fatecpg.heranca3.view;

import br.edu.fatecpg.heranca3.model.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SistemaDeSeguranca sistema = new SistemaDeSeguranca();

		String usuario;
		String senha;

		while (!sistema.isAutenticado()) {
			System.out.print("Digite o nome do usuário: ");
			usuario = scanner.nextLine();

			System.out.print("Digite a senha: ");
			senha = scanner.nextLine();

			if (sistema.login(usuario, senha)) {
				System.out.println("Bem vindo ao Sistema!");
			} else {
				System.out.println("Usuários ou senha incorretos!");
				System.out.println("Tente novamente.\n");
			}
		}
		System.out.println("\n1 - Fazer logout");
		System.out.println("0 - Sair");
		System.out.println("Escolha: ");

		int opcao = Integer.parseInt(scanner.nextLine());

		if (opcao == 1) {
			sistema.logout();
		} else if (opcao == 0) {
			System.out.println("Saindo do programa...");
		}

		scanner.close();
	}
}
