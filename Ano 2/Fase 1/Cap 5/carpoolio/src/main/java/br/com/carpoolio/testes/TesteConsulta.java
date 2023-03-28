package br.com.carpoolio.testes;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.hibernate.type.descriptor.DateTimeUtils;

import br.com.carpoolio.Entity.Aluguel;
import br.com.carpoolio.Entity.StatusVeiculo;
import br.com.carpoolio.Entity.Usuario;
import br.com.carpoolio.Entity.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class TesteConsulta {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			em = Persistence.createEntityManagerFactory("carpoolio").createEntityManager();
			
			//consulta usuario pelo indicine fornecido
//			Usuario consultaUsuario = em.find(Usuario.class, 1);
//					
//			if(consultaUsuario != null) {
//				System.out.println("ID: " + consultaUsuario.getId());
//				System.out.println("Nome: " + consultaUsuario.getNome());
//				System.out.println("Email: " + consultaUsuario.getEmail());
//				System.out.println("Senha: " + consultaUsuario.getSenha());
//				System.out.println("Telefone: " + consultaUsuario.getTelefone());
//				System.out.println("Cr�ditos: " + consultaUsuario.getCreditos());
//			}else {
//				System.out.println("Usu�rio n�o encontrado");
//			}em.close();
			
			//consulta veiculo
//			Veiculo consultaVeiculo = em.find(Veiculo.class, 3);
//			
//			if(consultaVeiculo != null) {
//				System.out.println("ID: " + consultaVeiculo.getId());
//				System.out.println("Capacidade: " + consultaVeiculo.getCapacidade());
//				System.out.println("Placa: " + consultaVeiculo.getPlaca());
//				System.out.println("Pre�o di�rio: " + consultaVeiculo.getPrecoDiario());
//				System.out.println("Status: " + consultaVeiculo.getStatus().getDescricao());
//				System.out.println("Tipo: " + consultaVeiculo.getTipo().getDescricao());
//				System.out.println("Propriet�rio: " + consultaVeiculo.getUsuarioProprietario().getNome());
//			}else {
//				System.out.println("Ve�culo n�o encontrado");
//			}em.close();
			
			
			
			//consulta aluguel
//			Aluguel consultaAluguel = em.find(Aluguel.class, 3);
//					
//			if(consultaAluguel != null) {
//				SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY");
//				
//				//recupera as datas e converte para o formato para imprimir
//				String dataInicio=dateFormat.format(consultaAluguel.getDataInicio().getTime());
//				String dataTermino=dateFormat.format(consultaAluguel.getDataTermino().getTime());
//				
//				System.out.println("ID: " + consultaAluguel.getId());
//				System.out.println("Data de In�cio: " + dataInicio);
//				System.out.println("Data de T�rmino: " + dataTermino);
//				System.out.println("Usu�rio Locat�rio: " + consultaAluguel.getLocatario().getNome());
//				System.out.println("Ve�culo: " + consultaAluguel.getVeiculo().getPlaca());
//				
//			}else {
//				System.out.println("Registro de aluguel n�o encontrado");
//			}em.close();
			
			
			
			
			
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
