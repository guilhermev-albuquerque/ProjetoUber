package entities;

public class Login extends Usuario {

	public Login() {
		super();
	}

	public Login(String nome, String nomeUsuario, String senha) {
		super(nome, nomeUsuario, senha);
	}
	
	public Login(String nomeUsuario, String senha) {
		super(nomeUsuario, senha);
	}
}
