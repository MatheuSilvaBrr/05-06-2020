package br.com.cesumar.forum;

public class Gerente {
	private String nome;
	private Integer codigo;
	private Loja loja;
	
	public Gerente(String nome, Integer codigo, Loja loja) {
		this.nome = nome;
		this.codigo = codigo;
		this.loja = loja;
	}

	public String getNome() {
		return nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public Loja getLoja() {
		return loja;
	}
	
	
	
	

}
