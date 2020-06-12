package br.com.cesumar.forum;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	private String nomeLoja;
	private Integer codigo;
	private List<Produto> produtos;
	private List<Fornecedor> fornecederoes;
	private Gerente gerente;
	
	public Loja(String nomeLoja, List<Produto> produtos) {
		this.nomeLoja = nomeLoja;
		this.produtos = new ArrayList<Produto>(produtos);
	}
	
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	public String getNomeLoja() {
		return nomeLoja;
	}
	public void adicionaProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		this.produtos.remove(produto);
	}
	
	public void adicionarForneceder(Fornecedor fornecedor) {
		this.fornecederoes.add(fornecedor);
		fornecedor.getLojasForncimento().add(this);
	}
	
	public void removerForncedor(Fornecedor fornecedor) {
		fornecederoes.remove(fornecedor);
		fornecedor.getLojasForncimento().remove(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nomeLoja == null) ? 0 : nomeLoja.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loja other = (Loja) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nomeLoja == null) {
			if (other.nomeLoja != null)
				return false;
		} else if (!nomeLoja.equals(other.nomeLoja))
			return false;
		return true;
	}
	
	
	
	
}
