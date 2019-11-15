package Fest;

import java.util.HashMap;

public class Radio  extends MediaPartner{
	
	Observer ob;
	public Radio(Observer ob) {
		
		this.ob=ob;
	}

	@Override
	public double getCostPerHour() {
		
		return 10;
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
