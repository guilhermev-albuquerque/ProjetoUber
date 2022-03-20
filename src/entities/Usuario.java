package entities;

public class Usuario {

	private String nome;
	private String nomeUsuario;
	private Integer cpf;
	private Integer idade;
	private String email;
	private String senha;
	
	public Usuario() {
		
	}
	
	public Usuario(String nomeUsuario, String senha) {
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}

	public Usuario(String nome, String nomeUsuario, String senha) {
		this.nome = nome;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}



	public Usuario(String nome, String nomeUsuario, Integer cpf, Integer idade, String email, String senha) {
		this.nome = nome;
		this.nomeUsuario = nomeUsuario;
		this.cpf = cpf;
		this.idade = idade;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
