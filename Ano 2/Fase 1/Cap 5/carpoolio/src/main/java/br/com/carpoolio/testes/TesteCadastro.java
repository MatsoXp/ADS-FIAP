package br.com.carpoolio.testes;

import java.time.LocalDate;
import java.util.Calendar;

import br.com.carpoolio.Entity.Aluguel;
import br.com.carpoolio.Entity.StatusVeiculo;
import br.com.carpoolio.Entity.TipoVeiculo;
import br.com.carpoolio.Entity.Usuario;
import br.com.carpoolio.Entity.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.transaction.Status;

public class TesteCadastro {

	public static void main(String[] args) {
		//Persistence.createEntityManagerFactory("carpoolio").createEntityManager();
		
		EntityManager em = null;
		
		
		try {
			em = Persistence.createEntityManagerFactory("carpoolio").createEntityManager();
		
			//cadastro de usuário
			
//			Usuario usuario = new Usuario();			
//			usuario.setNome("teste");
//			usuario.setEmail("teste123@gmail.com");
//			usuario.setSenha("12345");
//			usuario.setTelefone("999999999");
//			usuario.setCreditos(250);
			
			//cadastro de tipos de veiculos
			
//			TipoVeiculo tipoVeiculo = new TipoVeiculo();
//			tipoVeiculo.setDescricao("carro familiar");
//			
//			TipoVeiculo tipoVeiculo2 = new TipoVeiculo();
//			tipoVeiculo2.setDescricao("caminhão");
			
			//cadastro status veiculo
			
//			StatusVeiculo statusVeiculo = new StatusVeiculo();
//			statusVeiculo.setDescricao("disponível");
//			
//			StatusVeiculo statusVeiculo2 = new StatusVeiculo();
//			statusVeiculo2.setDescricao("alugado");
	
			
			
//			//cadastro de veiculo
			
			//recupera o status e tipo do banco através do indice para cadastrar no banco
//			StatusVeiculo consultaStatus = em.find(StatusVeiculo.class, 1);
//			TipoVeiculo consultaTipo = em.find(TipoVeiculo.class, 2);
//			Usuario consultaUsuario = em.find(Usuario.class, 2);
//
//			Veiculo veiculo = new Veiculo();
//			veiculo.setUsuarioProprietario(consultaUsuario);
//			veiculo.setTipo(consultaTipo);
//			veiculo.setStatus(consultaStatus);
//			veiculo.setPlaca("asd123");
//			veiculo.setCapacidade(5);
//			veiculo.setPrecoDiario(250);

			
			
			
			//cadastro de alguel
//			Usuario usuarioLocatario = em.find(Usuario.class, 1);
//			Veiculo veiculo = em.find(Veiculo.class, 3);
//			
//			Calendar dataInicio = Calendar.getInstance();
//			Calendar dataTermino = Calendar.getInstance();
//			dataTermino.add(Calendar.DAY_OF_MONTH, 4);
//			
//			Aluguel aluguel = new Aluguel();
//			aluguel.setLocatario(usuarioLocatario);
//			aluguel.setVeiculo(veiculo);
//			aluguel.setDataInicio(dataInicio);
//			aluguel.setDataTermino(dataTermino);
			
			
			
			//cadastra no banco o objeto desejado
			
		
//			em.merge(usuario);
//			em.merge(veiculo);
//			em.merge(aluguel);
			
		
			
			em.getTransaction().begin();
			em.getTransaction().commit();
			
			
		}catch (Exception e) {
			if(em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		}finally {
			if(em != null) {
				em.close();
			}
			System.exit(0);
		}
	}
}
