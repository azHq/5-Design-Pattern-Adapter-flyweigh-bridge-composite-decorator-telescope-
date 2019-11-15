package Fest;

import java.util.ArrayList;
import java.util.HashMap;

public class Observer {
	
	ArrayList<User> userList=new ArrayList<>();
	
	public Observer() {
		
	}

	public void addUser(User user) {
		
		userList.add(user);
	}
	public void notifyUser(HashMap<String,String> agendaList,String name) {
		
		for(User user:userList) {
			
			user.enjoyFest(agendaList,name);
			
		}
	}
}
