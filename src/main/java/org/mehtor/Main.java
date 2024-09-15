package org.mehtor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.mehtor.entity.Musteri;
import org.mehtor.entity.Satis;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(
				"tekrar_calismasi_hibernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Musteri musteri1 = new Musteri();
		musteri1.setAd("Hakan");
		
		Satis satis1 = new Satis();
		satis1.setUrun("Cep telefonu");
		
		entityManager.getTransaction().begin(); //veri işlemleri begin ve commit arasında yapılır.
		
		
//		entityManager.persist(satis1);
//		entityManager.persist(musteri1);
//		satis1.setMusteri(musteri1);
		
//		entityManager.persist(musteri1);
		
		entityManager.getTransaction().commit(); //commit
		
		entityManager.close();
		entityManagerFactory.close();
	}
}