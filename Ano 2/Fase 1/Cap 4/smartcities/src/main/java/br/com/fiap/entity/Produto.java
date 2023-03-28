package br.com.fiap.entity;

import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tb_produto")
public class Produto {

	@Id
	@SequenceGenerator(name="produto", sequenceName="sq_tb_produto", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="produto")
	@Column(name="cd_produto")
	private int id;
	
	@Column(name="nm_produto", nullable=false, length=50)
	private String nome;
	
	@Column(name="vl_preco")
	private double preço;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_data_validade")
	private Calendar dataValidade;
	
	@Enumerated(EnumType.STRING)
	private Estado estado;
	
	@Column(name="dt_cadastro")
	@CreationTimestamp
	private Calendar dataCadastro;
	
	@Column(name="dt_modificacao")
	@UpdateTimestamp
	private Calendar dataModificacao;
	
	//trocar o atributo formula caso algo dê errado
	@org.hibernate.annotations.Formula("vl_preco * 0.9")
	private double precoDesconto;
	
	
}


