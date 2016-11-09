package br.com.loja.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Pessoa {
	@Column(length= 50, nullable = false)
	private String nome;
	@Column(length=20, nullable= false)
	private String rg;
	@Column(length=14, nullable= false)
	private String cpf;
	@Column(length= 30, nullable= false)
	private String endereco;
	@Column(length= 20, nullable= false)
	private String bairro;
	@Column(length= 20 , nullable= false)
	private String complemento;
	@Column(length=15, nullable= false)
	private String telefone;
	@Column(length=15, nullable=false)
	private String celular;
	@Temporal(TemporalType.DATE)
	private Date nascimento;
	
	@ManyToOne
	@JoinColumn(nullable= false)
	private Cidade cidade;
		
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	

}
