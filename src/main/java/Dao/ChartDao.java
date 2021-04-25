package Dao;

import java.util.List;

public interface ChartDao {
	
	public void addToChart(int clientId,String designation);
	public List<String> getPanier(int clientId);

}
