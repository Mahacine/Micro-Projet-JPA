package Service;

import Dao.ClientDaoImpl;
import Entity.Client;

public class ClientServiceImpl implements ClientService{
	
	ClientDaoImpl clientDao=new ClientDaoImpl();

	@Override
	public void inscrireClient(String email, String nom, String prenom, String adresse, int codePostal, String ville,
			String tel, String motDePasse) {
		clientDao.inscrireClient(email, nom, prenom, adresse, codePostal, ville, tel, motDePasse);
	}

	@Override
	public int getClientId(String email) {
		return clientDao.getClientId(email);
	}

	@Override
	public Client getClient(String email, String motDePasse) {
		return clientDao.getClient(email, motDePasse);
	}
	
	

}
