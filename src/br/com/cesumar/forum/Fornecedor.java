package br.com.cesumar.forum;

import java.util.List;

public class Fornecedor {
	private String nome;
	private Integer codigo;
	private List<Loja> lojasForncimento;
	
	
	public void adicionarLoja(Loja loja){
		this.lojasForncimento.add(loja);
		loja.adicionarForneceder(this);
	}
	
	public void removerLoja(Loja loja) {
		this.lojasForncimento.remove(loja);
		loja.removerForncedor(this);
	}
	
	public List<Loja> getLojasForncimento() {
		return lojasForncimento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
