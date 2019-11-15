package Fest;

import java.util.HashMap;

public abstract class Fest {
	
	HashMap<String,String> agenda=new HashMap<String,String>();
	public abstract void startDate(String startDate);	
	public abstract void endDate(String endDate);
	public abstract void chiefGuest(String name);
	public abstract void addAgenda(String subject,String time);
	public abstract HashMap<String,String> getAgendaList();
	public abstract void setMediaPartner(MediaPartner mediapartner);
	public abstract void startCeremony();
	public abstract void sendInvitationMessage(Department dpt,Mediator mediator);

	
}
