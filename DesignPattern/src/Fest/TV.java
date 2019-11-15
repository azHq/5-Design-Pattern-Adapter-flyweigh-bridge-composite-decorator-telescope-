package Fest;

import java.util.HashMap;

public class TV extends MediaPartner{
	
	Observer ob;
	public TV(Observer ob) {
		
		this.ob=ob;
	}

	@Override
	public double getCostPerHour() {
		
		return 20;
	}

	@Override
	public void broadcast(HashMap<String,String> agendaList) {
		
		ob.notifyUser(agendaList," By TV partner");
		
	}

	@Override
	public double totalCost(int hour) {
		
		return getCostPerHour()*hour;
	}

}
