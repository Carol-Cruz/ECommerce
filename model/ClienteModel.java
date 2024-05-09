package ecommerce.model;

public abstract class ClienteModel {

	private String usuario;
	private String senha;

	public ClienteModel(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void visualizar() {
		System.out.println("Bem-vindo(a/e)!" + this.usuario);
	}

}
