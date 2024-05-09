package ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import ecommerce.repository.EcommerceRepository;

public class Carrinho implements EcommerceRepository {
	private List<Produto> produtos;

	public Carrinho() {
		produtos = new ArrayList<>();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public float calcularTotal() {
		float total = 0;
		for (Produto produto : produtos) {
			total += produto.getPreco();
		}
		return total;
	}

	@Override
	public void adicionarProduto(Produto produto) {
		// TODO Auto-generated method stub
		produtos.add(produto);
	}

	@Override
	public void removerProdutos(Produto produto) {
		// TODO Auto-generated method stub
		produtos.remove(produto);

	}
}
