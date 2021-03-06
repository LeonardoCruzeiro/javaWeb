package br.com.loja.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ItemVenda {
	@Column(nullable= false)
	private Short quantidade;
	@Column(precision= 7 , scale = 2 )
	private BigDecimal valorParcial;
	@ManyToOne
	@JoinColumn(nullable= false)
	private Produto produto;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Venda venda;
	
	public Short getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValorParcial() {
		return valorParcial;
	}
	public void setValorParcial(BigDecimal valorParcial) {
		this.valorParcial = valorParcial;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
}
