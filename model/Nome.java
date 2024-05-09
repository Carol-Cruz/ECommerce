package ecommerce.model;

import ecommerce.Menu;

public class Nome extends ClienteModel {
	private String nome;

	public Nome(String usuario, String senha, String nome) {
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
		System.out.println("Cliente de nome: " + this.nome);

	}

	public boolean verificarLogin(String usuario, String senha) {
		return this.getUsuario().equals(usuario) && this.getSenha().equals(senha);
	}
}
