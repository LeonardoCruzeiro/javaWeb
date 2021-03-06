package br.com.loja.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.loja.modelo.Pessoa;

public class Cliente {
	
	@Column(nullable= false)
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	@Column(nullable= false)
	private boolean liberado;
	@OneToOne
	@JoinColumn(nullable=false)
	private Pessoa pessoa;

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public boolean isLiberado() {
		return liberado;
	}

	public void setLiberado(boolean liberado) {
		this.liberado = liberado;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
