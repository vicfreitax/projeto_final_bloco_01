package menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Controller;


public class Menu {

	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	Controller livros = new Controller();
	
		
		int opcao;
		
		while(true) {
			System.out.println("*****************************************************");
			System.out.println("													");
			System.out.println("              LivrosUsados.com		                ");
			System.out.println("													");
			System.out.println("****************************************************");
			System.out.println("													");
			System.out.println("            1- Criar Produto                        ");
			System.out.println("            2- Listar Produtos                      ");
			System.out.println("            3- Atualizar Produto                    ");
			System.out.println("            4- Deletar Produto                      ");
			System.out.println("            5- Sair	                                ");
			System.out.println("													");
			System.out.println("****************************************************");
			System.out.println("Entre com a opção desejada:                         ");
			System.out.println("													");

			try {
				opcao = read.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				read.nextLine();
				opcao=0;
			}
		if(opcao==5) {
			System.out.println("\nLivrosUsados.com todo livro que você quiser em um só lugar!");
			sobre();
			read.close();
			System.exit(0);
		}
	
		switch(opcao) {
		case 1:
			System.out.println("Criar Produto \n\n");
			
			keyPress();
			break;
		case 2:
			System.out.println("Listar Produtos\n\n");
			livros.listarTodos();
			keyPress();
			break;
		case 3:
			System.out.println("Atualizar Produto\n\n");
			
			keyPress();
			break;
		case 4:
			System.out.println("Deletar Produto\n\n");
			
			keyPress();
			break;

		default:
			System.out.println("\nOpção Inválida!\n");
			
			keyPress();
			break;}}
		
	}
	

public static void sobre() {
	System.out.println("\n***********************************************");
	System.out.println("Projeto Desenvolvido por: ");
	System.out.println("Victoria Freitas - victoriafreitax@gmail.com");
	System.out.println("github.com/vicfreitax");
	System.out.println("\n**********************************************");

	}

public static void keyPress() {

	try {
		System.out.println("\n\nPressione Enter para Continuar...");
		System.in.read();

	} catch (IOException e) {
		System.out.println("Você pressionou uma tecla diferente de enter!");

	}
}

}
