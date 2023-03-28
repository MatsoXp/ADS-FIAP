package br.com.carpoolio.Entity;

import java.util.Collection;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_tipo_veiculo")
public class TipoVeiculo {

	@Id
	@Column(name="id_tipo_veiculo")
	@SequenceGenerator(name="tipo", sequenceName="sq_tb_tipo_veiculo", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tipo")
	private int id;
	
	@Column(name="ds_descricao_tipo", nullable=false, length=25)
	private String descricao;

//	@OneToMany(mappedBy = "ds_descricao_tipo")
//	List<Veiculo> veiculos;
	
	
	public TipoVeiculo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public TipoVeiculo(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	
	

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

	
}
