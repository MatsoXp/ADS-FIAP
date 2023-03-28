package br.com.carpoolio.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_status_veiculo")
public class StatusVeiculo {

	@Id
	@Column(name="id_status_veiculo")
	@SequenceGenerator(name="status", sequenceName="sq_tb_status_veiculo", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="status")
	private int id;
	
	@Column(name="ds_descricao-status", nullable=false, length=25)
	private String descricao;

	
	
	
	public StatusVeiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatusVeiculo(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
}



