package Service;

import java.util.List;

import Dao.ChartDaoImpl;

public class ChartServiceImpl implements ChartService{
	
	ChartDaoImpl chartDao=new ChartDaoImpl();

	@Override
	public void addToChart(int clientId, String designation) {
		chartDao.addToChart(clientId, designation);
	}

	@Override
	public List<String> getPanier(int clientId) {
		return chartDao.getPanier(clientId);
	}
	
	

}
