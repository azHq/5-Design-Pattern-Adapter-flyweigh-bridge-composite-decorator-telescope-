package Fest;

import java.util.HashMap;

public class MathOlympiad  extends Fest{
	
	MediaPartner mediapartner;
	public String startDate;
	public String endDate;
	public String name;
	public String chiefGuest;
	
	public MathOlympiad(String name) {
		
		this.name=name;
	}
	@Override
	public void startDate(String startDate) {
		
		this.startDate=startDate;
	}

	@Override
	public void endDate(String endDate) {
	
		this.endDate=endDate;
	}

	@Override
	public void chiefGuest(String chiefGuest) {
		
		this.chiefGuest=chiefGuest;
	}

	@Override
	public void addAgenda(String subject, String time) {
		
		agenda.put(subject,time);
	}

	@Override
	public HashMap<String, String> getAgendaList() {
	
		return agenda;
	}

	@Override
	public void setMediaPartner(MediaPartner mediapartner) {
		
		this.mediapartner=mediapartner;
	}
	public void startCeremony() {
		
		mediapartner.broadcast(agenda);
	}
	@Override
	public void sendInvitationMessage(Department dpt,Mediator mediator) {
		
		mediator.sendMessage(dpt.deptName+" invited to "+name);
	}

}