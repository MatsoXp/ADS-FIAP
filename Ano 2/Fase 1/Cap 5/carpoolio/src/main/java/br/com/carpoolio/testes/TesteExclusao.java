package br.com.carpoolio.testes;

import br.com.carpoolio.Entity.Aluguel;
import br.com.carpoolio.Entity.Usuario;
import br.com.carpoolio.Entity.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class TesteExclusao {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			em = Persistence.createEntityManagerFactory("carpoolio").createEntityManager();
			
			//exclui usuario aluguel e veiculo, só descomentar, trocar o id e passar o objeto no em.remove
//			Usuario consultaUsuario = em.find(Usuario.class, 1);
//			Aluguel consultaAluguel = em.find(Aluguel.class, 3);
			Veiculo consultaVeiculo = em.find(Veiculo.class, 2);
			
			em.remove(consultaVeiculo);
			
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
