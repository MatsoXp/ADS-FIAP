package br.com.carpoolio.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
public class Usuario {
	
	@Id
	@Column(name="id_usuario")
	@SequenceGenerator(name="usuario", sequenceName="sq_tb_usuario", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usuario")
	private int id;
	
	@Column(name="nm_usuario", nullable=false, length=50)
	private String nome;

	@Column(name="ds_email", nullable=false, length=50)
	private String email;
	
	@Column(name="ds_senha", nullable=false, length=10)
	private String senha;
	
	@Column(name="ds_telefone", nullable=false, length=12)
	private String telefone;
	
	@Column(name="ds_creditos", nullable=false)
	private double creditos;

	
	
	
	public Usuario() {
		super();
	}


	public Usuario(int id, String nome, String email, String senha, String telefone, double creditos) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.creditos = creditos;
	}
	
	

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getCreditos() {
		return creditos;
	}

	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}
	
	
}
