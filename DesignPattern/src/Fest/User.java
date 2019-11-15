package Fest;

import java.util.HashMap;

public class User {
	public String name;
	public String email;
	public User(String name,String email) {
		
		this.name=name;
		this.email=email;
	}
	
	public void enjoyFest(HashMap<String,String> agendaList,String mediaName) {
		
		for(String sub:agendaList.keySet()) {
			System.out.println(name+" Enjoying "+sub+" at "+agendaList.get(sub)+mediaName);
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
