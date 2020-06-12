package br.com.cesumar.forum;

public class Produto {
	private String nomeProduto;
	private Integer codigoProduto;
	private Fornecedor forncedorProduto;
	
	
	public Produto(String nomeProduto, Integer codigoProduto) {
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public Integer getCodigoProduto() {
		return codigoProduto;
	}
	public Fornecedor getForncedorProduto() {
		return forncedorProduto;
	}
	
	
}
