package ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import ecommerce.repository.EcommerceRepository;

public class Carrinho implements EcommerceRepository {
	private List<Produto> produtos;

	public Carrinho() {
		this.produtos = new ArrayList<>();

	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public float calcularTotal() {
		float total = 0f;
		for (Produto produto : produtos) {
			total += produto.getPreco();
		}
		return total;
	}

	@Override
	public void mostraProduto() {

		for (Produto produto : produtos) {
			System.out.println(produto.getItem() + " - R$ " + produto.getPreco());
		}

	}

	@Override
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}

	@Override
	public void removerProdutos(Produto produto) {
		// TODO Auto-generated method stub
		produtos.remove(produto);

	}

}
