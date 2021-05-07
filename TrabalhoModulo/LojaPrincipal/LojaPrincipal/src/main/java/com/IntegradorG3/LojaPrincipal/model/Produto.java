package com.IntegradorG3.LojaPrincipal.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name="tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size
	private String nome;
	
	@NotNull
	@Size
	private String tamanho;

	@NotNull
	@Size
	private String cor;
	
	@NotNull
	@Size
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Usuario nomeCompleto;
	
	@ManyToOne
	@JsonIgnoreProperties("camiseta")
	private Usuario tipo;
	
	

	public Usuario getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(Usuario nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Usuario getTipo() {
		return tipo;
	}

	public void setTipo(Usuario tipo) {
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
}
