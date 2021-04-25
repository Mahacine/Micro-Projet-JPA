package Dao;

import Entity.Client;
import Util.HibernateUtil;

public class ClientDaoImpl implements ClientDao{
	
	private HibernateUtil util = new HibernateUtil();

	
	
	public ClientDaoImpl() {
		super();
	}

	@Override
	public void inscrireClient(String email, String nom, String prenom, String adresse, int codePostal, String ville,
			String tel, String motDePasse) {
		util.getEntityManager().getTransaction().begin();
        Client s1=new Client(email,nom,prenom,adresse,codePostal,ville,tel,motDePasse);
        util.getEntityManager().persist(s1);
        util.getEntityManager().getTransaction().commit();
		
	}

	@Override
	public int getClientId(String email) {
		Client c=util.getEntityManager().createQuery( "from Client where email='"+email+"'", Client.class ).getSingleResult();
		return c.getId();
	}

	@Override
	public Client getClient(String email, String motDePasse) {
		Client c=util.getEntityManager().createQuery( "from Client where email='"+email+"' and motdepasse='"+motDePasse+"'", Client.class ).getSingleResult();
		return c;
	}

}
