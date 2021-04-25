package Service;

import Entity.Client;

public interface ClientService {
	
	public void inscrireClient(String email, String nom, String prenom, String adresse, int codePostal, String ville,
			String tel, String motDePasse);
	public int getClientId(String email);
	public Client getClient(String email,String motDePasse);
}
