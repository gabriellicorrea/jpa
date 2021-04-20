package br.com.alura.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class AlteraSaldoContaGabi {

public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
	
		Conta contaDaGabi = em.find(Conta.class, 1L);
		Conta contaDoKaue = em.find(Conta.class, 4L);
		
		em.getTransaction().begin();
		
		contaDaGabi.setSaldo(20.0);
		contaDoKaue.setSaldo(30.0);
		em.getTransaction().commit();
	}
	
}
