package br.com.carpoolio.testes;

import java.util.Calendar;

import br.com.carpoolio.Entity.Aluguel;
import br.com.carpoolio.Entity.StatusVeiculo;
import br.com.carpoolio.Entity.TipoVeiculo;
import br.com.carpoolio.Entity.Usuario;
import br.com.carpoolio.Entity.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class TesteAtualizacao {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			em = Persistence.createEntityManagerFactory("carpoolio").createEntityManager();
			
			
			//atualiza usuario pelo ID
//			Usuario consultaUsuario = em.find(Usuario.class, 1);
//					
//			consultaUsuario.setNome("joaozinho");
//			consultaUsuario.setEmail("novoemail@gmail.com");
//			consultaUsuario.setSenha("senhanova");
//			consultaUsuario.setTelefone("44444444444");
//			consultaUsuario.setCreditos(1500);
			
			
			//atualiza veiculo por iD
			//veiculo a ser alterado
//			Veiculo consultaVeiculo = em.find(Veiculo.class, 1);
//			
//			TipoVeiculo consultaTipo = em.find(TipoVeiculo.class, 1);
//			Usuario consultaUsuario = em.find(Usuario.class, 1);
//			StatusVeiculo consultaStatus = em.find(StatusVeiculo.class, 2);
//			
//			consultaVeiculo.setCapacidade(3);
//			consultaVeiculo.setPlaca("www555");
//			consultaVeiculo.setPrecoDiario(320);
//			consultaVeiculo.setStatus(consultaStatus);
//			consultaVeiculo.setTipo(consultaTipo);
//			consultaVeiculo.setUsuarioProprietario(consultaUsuario);
			
			
			//atualiza aluguel por id
//			Aluguel consultaAluguel = em.find(Aluguel.class, 3);
//			Usuario usuarioLocatario = em.find(Usuario.class, 2);
//			Veiculo veiculo = em.find(Veiculo.class, 2);
//			
//			Calendar dataTermino = Calendar.getInstance();
////		adicionar quantos dias o usuario quer prolongar o aluguel
//			dataTermino.add(Calendar.DAY_OF_MONTH, 5);
//			
//			consultaAluguel.setDataTermino(dataTermino);
//			consultaAluguel.setValorTotal(2500);
//			consultaAluguel.setLocatario(usuarioLocatario);
//			consultaAluguel.setVeiculo(veiculo);
			
			
			
			
			
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
