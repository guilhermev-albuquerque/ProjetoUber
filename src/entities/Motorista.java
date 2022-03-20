package entities;

import entities.enums.CategoriaUber;

public class Motorista {
	
	private String nomeMotorista;
	private Integer classificacao;
	private String carro;
	private CategoriaUber categoriaUber;
	
	public Motorista() {
		
	}

	public Motorista(String nomeMotorista, Integer classificacao, String carro, CategoriaUber categoriaUber) {
		this.nomeMotorista = nomeMotorista;
		this.classificacao = classificacao;
		this.carro = carro;
		this.categoriaUber = categoriaUber;
	}

	public String getNomeMotorista() {
		return nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}

	public Integer getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	public CategoriaUber getCategoriaUber() {
		return categoriaUber;
	}

	public void setCategoriaUber(CategoriaUber categoriaUber) {
		this.categoriaUber = categoriaUber;
	}

}
