package ecommerce.model;

public abstract class EcommerceModel {
	
    private String usuario;
    private String senha;
	public EcommerceModel(String usuario, String senha) {
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
   
	public boolean verificaSenha(String senha) {
		return this.senha.equals(senha);
	}
	public void visualizar() {
	System.out.println("Bem-vindo(a/e): " + this.usuario);
	}
}
