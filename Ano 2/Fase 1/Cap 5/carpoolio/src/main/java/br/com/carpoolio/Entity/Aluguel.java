package br.com.carpoolio.Entity;

import java.time.LocalDate;
import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tb_aluguel")
public class Aluguel {
	
	
	@Id
	@Column(name="id_aluguel")
	@SequenceGenerator(name="aluguel", sequenceName="sq_tb_aluguel", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="aluguel")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id_usuario_locatario")
	private Usuario locatario;

	@ManyToOne
	@JoinColumn(name="id_veiculo")
	private Veiculo veiculo;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="dt_inicio")
	private Calendar dataInicio;	
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_termino")
	private Calendar dataTermino;
	
	@Column(name="vl_total")
	private double valorTotal;
	
	
	
	
	

	public Aluguel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluguel(int id, Usuario locatario, Veiculo veiculo, Calendar dataInicio, Calendar dataTermino,
			double valorTotal) {
		super();
		this.id = id;
		this.locatario = locatario;
		this.veiculo = veiculo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.valorTotal = valorTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getLocatario() {
		return locatario;
	}

	public void setLocatario(Usuario locatario) {
		this.locatario = locatario;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Calendar dataTermino) {
		this.dataTermino = dataTermino;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}


	
	
}






