package Dao;

import java.util.ArrayList;
import java.util.List;

import Entity.Panier;
import Util.HibernateUtil;

public class ChartDaoImpl implements ChartDao{
	
	private HibernateUtil util = new HibernateUtil();
	
	
	

	public ChartDaoImpl() {
		super();
	}

	@Override
	public void addToChart(int clientId, String designation) {
		util.getEntityManager().getTransaction().begin();
        Panier p=new Panier(clientId,designation);
        util.getEntityManager().persist(p);
        util.getEntityManager().getTransaction().commit();
	}

	@Override
	public List<String> getPanier(int clientId) {
		List<Panier> panier = util.getEntityManager().createQuery( "from Panier where client_id="+clientId, Panier.class )
                .getResultList();
		List<String> produits =new ArrayList<String>();
		for(Panier p:panier) {
			produits.add(p.getDesignation());
		}
		return produits;
	}

}
