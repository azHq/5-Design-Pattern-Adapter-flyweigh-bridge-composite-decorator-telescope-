package Fest;

import java.util.HashMap;

public abstract class MediaPartner {
	
	public abstract double getCostPerHour();
	public abstract void broadcast(HashMap<String,String> agendaList);
	public abstract double totalCost(int hour);
	
}
