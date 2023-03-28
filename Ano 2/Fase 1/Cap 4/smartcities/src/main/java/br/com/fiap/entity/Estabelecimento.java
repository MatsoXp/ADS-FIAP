package br.com.fiap.entity;

import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tb_estabelecimento")
public class Estabelecimento {

	@Id
	@Column(name="cd_estabelecimento")
	@SequenceGenerator(name="estabelecimento", sequenceName="sq_tb_estabelecimento", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="estabelecimento")
	private int id;
	
	@Column(name="nm_nome", length=50)
	private String nome;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_criacao")
	private Calendar dataCriacao;
	
	@UpdateTimestamp
	@Column(name="dt_modificacao")
	private Calendar dataModificacao;
	
	
	

	public Estabelecimento() {
		super();
	}

	public Estabelecimento(int id, String nome, Calendar dataCriacao, Calendar dataModificacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.dataModificacao = dataModificacao;
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Calendar getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Calendar dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	
	
	
	
	
}
