package ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura = new Scanner(System.in);
		
		

		int opcao=0;
        String usuario,senha;
		while (true ) {

			System.out.println("                                                     ");
			System.out.println("                E-COMMERCE ON-LINE                   ");
			System.out.println("                                                     ");
			System.out.println("                   1- Criar login               ");
			System.out.println("                   2- Minha conta                    ");
			System.out.println("                   3-         Produtos   ");
			System.out.println("                   4- Carrinho de compras        ");
			System.out.println("                   5- Listar produtos                ");
			System.out.println("                   6- Sobre o programa...            ");
			System.out.println("                   7-  Sair                          ");

			
			try {
				opcao = captura.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite um valor do tipo inteiro!");
				captura.nextLine();
				opcao = 0;
			}
			if (opcao == 7) {
				System.out.println("Obrigado por utilizar o meu E-Commerce!");
								sobre();
								captura.close();
								System.exit(0);
				
			}
			switch (opcao) {

			case 1:
		
				System.out.println("Digite seu usuário");
				captura.nextLine();
                usuario = captura.nextLine();
               

				System.out.println("Digite sua senha");
				captura.nextLine();
				senha = captura.nextLine();
			
				System.out.println("Usuário cadastrado com sucesso!");
			
				break;

			case 2:
				System.out.println("Digite seu usuário");
				captura.nextLine();
                usuario = captura.nextLine();
         
				System.out.println("Digite sua senha");
				captura.nextLine();
				senha = captura.nextLine();
				
				break;
			case 3:
				break;

			case 4:
				break;
			case 5:
				break;
			case 6:
				sobrePrograma();

				break;
			case 7:
		break;
			default:
				System.out.println("Opção inválida!");
				break;

			}

		}

	}

	public static void sobre() {
		System.out.println("Projeto Desenvolvido por: Carol Cruz");
		System.out.println("Carol Cruz - carol.karol@live.com");
		System.out.println("https://github.com/Carol-Cruz");
	}
	public static void sobrePrograma() {
		System.out.println("Programa de e-commerce on-line com os melhores produtos! Boas compras :)");
	}
}
