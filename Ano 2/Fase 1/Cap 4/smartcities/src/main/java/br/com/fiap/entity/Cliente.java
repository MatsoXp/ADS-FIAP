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

@Entity
@Table(name="tb_cliente")
public class Cliente {

	@Id
	@Column(name="cd_cliente")
	@SequenceGenerator(name="cliente", sequenceName="sq_tb_cliente", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente")
	private int codigo;
	
	@Column(name="nr_cpf", nullable=false, length=11)
	private String cpf;
	
	@Column(name="nm_nome", nullable=false, length=50)
	private String nome;
	
	@Column(name="nr_idade")
	private int idade;
	
	@CreationTimestamp
	@Column(name="dt_cadastro")
	private Calendar dataCadastro;
	
	@UpdateTimestamp
	@Column(name="dt_modificacao")
	private Calendar dataModificacao;

	

	
	
	public Cliente() {
		super();
	}


	public Cliente(int codigo, String cpf, String nome, int idade, Calendar dataCadastro, Calendar dataModificacao) {
		super();
		this.codigo = codigo;
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.dataCadastro = dataCadastro;
		this.dataModificacao = dataModificacao;
	}


	
	
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public Calendar getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public Calendar getDataModificacao() {
		return dataModificacao;
	}


	public void setDataModificacao(Calendar dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	
	
	
	
}
