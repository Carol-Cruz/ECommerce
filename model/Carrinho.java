package ecommerce.model;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private ArrayList<Produto> produtos;

 public Carrinho() {
	 produtos = new ArrayList<>();
 }


public void adicionarProduto(Produto produto) {
	produtos.add(produto);
}

public void removerProduto(Produto produto) {
	produtos.remove(produto);
}


public List<Produto> getProdutos() {
    return produtos;
}

public float calcularTotal() {
    double total = 0;
    for (Produto produto : produtos) {
        total += produto.getPreco();
    }
    return total;
}}
