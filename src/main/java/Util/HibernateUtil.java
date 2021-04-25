package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	
	private EntityManagerFactory entityManagerFactory ;
    private EntityManager entityManager;
    
    
	public HibernateUtil() {
		super();
		entityManagerFactory = Persistence.createEntityManagerFactory("GI4");
        entityManager = entityManagerFactory.createEntityManager();
	}
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
    
    

}
