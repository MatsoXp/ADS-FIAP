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
@Table(name="tb_funcionario")
public class Funcionario {
	
	@Id
	@Column(name="cd_funcionario")
	@SequenceGenerator(name="funcionario", sequenceName="sq_tb_funcionario", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="funcionario")
	private int codigo;
	
	@Column(name="nm_nome", nullable=false, length=50)
	private String nome;
	
	@Column(name="nr_cpf", nullable=false, length=11)
	private String cpf;
	
	@Column(name="nr_idade")
	private int idade;
	
	@CreationTimestamp
	@Column(name="dt_cadastro")
	private Calendar dataCadastro;
	
	@UpdateTimestamp
	@Column(name="dt_modificacao")
	private Calendar dataModificacao;
	
	@Column(name="ds_cargo", nullable=false, length=25)
	private String cargo;
	
	@Column(name="vl_salario")
	private double salario;

	
	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Funcionario(int codigo, String nome, String cpf, int idade, Calendar dataCadastro, Calendar dataModificacao,
			String cargo, double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.dataCadastro = dataCadastro;
		this.dataModificacao = dataModificacao;
		this.cargo = cargo;
		this.salario = salario;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
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



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
