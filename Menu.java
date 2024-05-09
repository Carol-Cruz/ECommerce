package ecommerce;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.repository.EcommerceRepository;
import ecommerce.model.Carrinho;
import ecommerce.model.Nome;
import ecommerce.model.Produto;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura = new Scanner(System.in);

		int opcao = 0;
		float preco = 0f;
		String usuario = "", senha = "", nome = "", item = "";

		Nome cliente = new Nome(usuario, senha, nome);
		Carrinho carrinho = new Carrinho();

		ArrayList<Produto> itens = new ArrayList<Produto>();
		Produto produto1 = new Produto("Camiseta", 29.99f);
		Produto produto2 = new Produto("Calça jeans", 79.99f);
		Produto produto3 = new Produto("Shorts", 29.99f);
		Produto produto4 = new Produto("Blusa de frio", 54.99f);
		Produto produto5 = new Produto("Saia lápis", 34.99f);
		Produto produto6 = new Produto("Cropped", 24.99f);
		Produto produto7 = new Produto("Regata", 19.99f);
		Produto produto8 = new Produto("Carteira", 29.99f);
		Produto produto9 = new Produto("Bolsa", 79.99f);
		Produto produto10 = new Produto("Vestido tubo", 49.99f);
		Produto produto11 = new Produto("Macaquinho verão", 34.99f);
		Produto produto12 = new Produto("Cinto", 12.99f);
		Produto produto13 = new Produto("Necessaire", 24.99f);
		Produto produto14 = new Produto("Chinelo rasteira", 9.99f);
		itens.add(produto1);
		itens.add(produto2);
		itens.add(produto3);
		itens.add(produto4);
		itens.add(produto5);
		itens.add(produto6);
		itens.add(produto7);
		itens.add(produto8);
		itens.add(produto9);
		itens.add(produto10);
		itens.add(produto11);
		itens.add(produto12);
		itens.add(produto13);
		itens.add(produto14);

		while (true) {

			System.out.println("                                                     ");
			System.out.println("                E-COMMERCE ON-LINE                   ");
			System.out.println("                    Loja Coraz                       ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("                   1- Criar login                    ");
			System.out.println("                   2- Minha conta                    ");
			System.out.println("                   3- Produtos                       ");
			System.out.println("                   4- Carrinho de compras            ");
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
				usuario = captura.nextLine();
				cliente.setUsuario(usuario);

				captura.nextLine();
				System.out.println("Digite sua senha");

				senha = captura.nextLine();
				cliente.setSenha(senha);

				System.out.println("Digite seu nome!");

				nome = captura.nextLine();
				cliente.setNome(nome);

				System.out.println("Usuário cadastrado com sucesso!");
				cliente.visualizar();

				break;

			case 2:

				System.out.println("Entre com a sua conta! \nDigite seu usuário:");

				usuario = captura.nextLine();

				captura.nextLine();
				System.out.println("Digite sua senha");

				senha = captura.nextLine();

				if (cliente.verificarLogin(usuario, senha)) {

					System.out.println("Boas compras!");
				} else
					System.out.println("Usuário ou senha inválidos!");
				break;

			case 3:
				System.out.println("Bem-vindo(a/e) " + cliente.getNome() + " a loja Coraz! ");

				System.out.println("Produtos disponíveis:");

				int i = 1;
				for (Produto mostra : itens) {

					System.out.println("Item " + i + ": " + mostra.getItem());
					i++;
					System.out.println("Preço: " + mostra.getPreco());

				}

				System.out.println("Para comprar adicione os produtos ao seu carrinho!");
				System.out.println("Coloque o item relacionado ao produto:");
				int produtoEscolhido = captura.nextInt();

				if (produtoEscolhido == 1) {
					carrinho.adicionarProduto(produto1);
				}
				if (produtoEscolhido == 2) {
					carrinho.adicionarProduto(produto2);
				}
				if (produtoEscolhido == 3) {
					carrinho.adicionarProduto(produto3);
				}
				if (produtoEscolhido == 4) {
					carrinho.adicionarProduto(produto4);
				}
				if (produtoEscolhido == 5) {
					carrinho.adicionarProduto(produto5);
				}
				if (produtoEscolhido == 6) {
					carrinho.adicionarProduto(produto6);
				}
				if (produtoEscolhido == 7) {
					carrinho.adicionarProduto(produto7);
				}
				if (produtoEscolhido == 8) {
					carrinho.adicionarProduto(produto8);
				}
				if (produtoEscolhido == 9) {
					carrinho.adicionarProduto(produto9);
				}
				if (produtoEscolhido == 10) {
					carrinho.adicionarProduto(produto10);
					
				}
				if (produtoEscolhido == 11) {
					carrinho.adicionarProduto(produto11);
					
				}
				if (produtoEscolhido == 12) {
					carrinho.adicionarProduto(produto12);
					
				}
				if (produtoEscolhido == 13) {
					carrinho.adicionarProduto(produto13);
					
				}
				if (produtoEscolhido == 14) {
					carrinho.adicionarProduto(produto14);
					
					
				}

				break;

			case 4:
				System.out.println("Seu carrinho de compras: ");
				System.out.println("O valor de suas compras está " + carrinho.calcularTotal());

				break;

			case 6:
				sobrePrograma();

				break;

			default:
				System.out.println("Opção inválida!");
				break;

			}
		}

	}

	private static char[] Nome(String usuario, String senha, String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void ClienteModel() {
		// TODO Auto-generated method stub

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
