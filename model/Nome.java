package ecommerce.model;

import ecommerce.Ecommerce;

public class Nome extends EcommerceModel {
	private String nome;

	public Nome(String usuario, String senha) {
		super(usuario, senha);
		// TODO Auto-generated constructor stub
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	} 
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nome do usuário: " + this.nome);

	}


}
