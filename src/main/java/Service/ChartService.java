package Service;

import java.util.List;

public interface ChartService {
	
	public void addToChart(int clientId,String designation);
	public List<String> getPanier(int clientId);

}
