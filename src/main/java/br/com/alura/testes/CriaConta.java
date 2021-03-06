package br.com.alura.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaConta {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setTitular("Gabi");
		conta.setAgencia(1234);
		conta.setNumero(123456);
		
		Conta conta2 = new Conta();
		conta2.setTitular("Kaue");
		conta2.setAgencia(4321);
		conta2.setNumero(654321);
		
		em.getTransaction().begin();
		
		em.persist(conta);
		em.persist(conta2);
	
		em.getTransaction().commit();
	}
	
}
