package br.com.carpoolio.Entity;

import java.time.LocalDate;
import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_veiculo")
public class Veiculo {
	
	@Id
	@Column(name="id_veiculo")
	@SequenceGenerator(name="veiculo", sequenceName="sq_tb_veiculo", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="veiculo")
	private int id;

	@Column(name="ds_placa", length=6)
	private String placa;
	
	@Column(name="ds_capacidade", nullable=false, length=3)
	private int capacidade;
	
	@Column(name="vl_diaria", nullable=false)
	private double precoDiario;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_veiculo")
	private TipoVeiculo tipo;

	@ManyToOne
	@JoinColumn(name="id_status_veiculo")
	private StatusVeiculo status;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuarioProprietario;
	
	

	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Veiculo(int id, String placa, int capacidade, double precoDiario, TipoVeiculo tipo) {
		super();
		this.id = id;
		this.placa = placa;
		this.capacidade = capacidade;
		this.precoDiario = precoDiario;
		this.tipo = tipo;
	}
	
	
	public void alugar(Usuario usuarioLocatario, Calendar dataInicio, Calendar dataTermino) {
		Aluguel aluguel = new Aluguel();
		aluguel.setLocatario(usuarioLocatario);
		aluguel.setVeiculo(this);
		aluguel.setDataInicio(dataInicio);
		aluguel.setDataTermino(dataTermino);

	}
	
	


	public Usuario getUsuarioProprietario() {
		return usuarioProprietario;
	}



	public void setUsuarioProprietario(Usuario usuarioProprietario) {
		this.usuarioProprietario = usuarioProprietario;
	}



	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public double getPrecoDiario() {
		return precoDiario;
	}

	public void setPrecoDiario(double precoDiario) {
		this.precoDiario = precoDiario;
	}

	public TipoVeiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}
	
	public StatusVeiculo getStatus() {
		return status;
	}

	public void setStatus(StatusVeiculo status) {
		this.status = status;
	}
	
	
}
