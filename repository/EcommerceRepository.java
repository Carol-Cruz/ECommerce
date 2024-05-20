package ecommerce.repository;

import ecommerce.model.Nome;
import ecommerce.model.Produto;

public interface EcommerceRepository {

	public void adicionarProduto(Produto produto);

	public void removerProdutos(Produto produto);
	
	public void mostraProduto();

}
