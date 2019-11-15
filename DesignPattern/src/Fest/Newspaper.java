package Fest;

import java.util.HashMap;

public class Newspaper extends MediaPartner{
	
	Observer ob;
	public Newspaper(Observer ob) {
		
		this.ob=ob;
	}

	@Override
	public double getCostPerHour() {
		
		return 5;
	}

	@Override
	public void broadcast(HashMap<String,String> agendaList) {
		
		ob.notifyUser(agendaList," By radio partner");
		
	}

	@Override
	public double totalCost(int hour) {
		
		return getCostPerHour()*hour;
	}

	

}
