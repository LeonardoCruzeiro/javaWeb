package br.com.loja.modelo;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Usuario {
	@Column(length= 8, nullable= false)
	private String senha;
	
	@Column(nullable= false)
	private Character tipo;
	@Column(nullable=false)
	private boolean ativo;
	
	@ManyToOne
	@JoinColumn(nullable= false)
	private Pessoa pessoa;
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Character getTipo() {
		return tipo;
	}
	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
