package Fest;

import java.util.Scanner;

public class Bridge {
	
	Observer ob=new Observer();
	Mediator mediator=new Mediator();
	MediaPartner[] mp= {new Radio(ob),new TV(ob),new Newspaper(ob)};
	Fest[] fest= {new IITFest("IITFest"),new CSEFest("CSEFest"),new MathOlympiad("MathOlympiad")};
	Department[] departments=new Department[3];
	Scanner scr=new Scanner(System.in);
	public Bridge() {
		
		createDepartmentObj();
		
		while(true) {
			
			System.out.println("User Name:");
			String name=scr.nextLine();
			
			if(name.equals("end")) break;
			System.out.println("User Email:");
			String email=scr.nextLine();
			
			ob.addUser(new User(name,email));
			
		}
		
	}
	public void initCeremonyWithMediapartner() {
		
		while(true) {
			
			
			System.out.println("\nSelect Fest:\n1.IITFest\n2.CSEFest\n3.Matholympiad");
			int item=scr.nextInt()-1;
			Fest selectedfest=fest[item];
			
			System.out.println("Enter Your Number of days for Booking TSC....");
			int bookdays=scr.nextInt();
			
			TSC tsc=TSC.getInstance(bookdays);
			if(!tsc.getBook()) {
				
				System.out.println("Sorry,No Available Days for Book");
				System.out.println(tsc.getAvailableDays()+" Days Available.You can book for "+tsc.getAvailableDays()+" days");
			}
			else {
				
				System.out.println("Successfully Booked TSC");
				String s=scr.nextLine();
				System.out.println("Do you Send Invitation message?");
				s=scr.nextLine();
				
				
				if(s.equals("yes")||s.equals("send")) {
					
					selectedfest.sendInvitationMessage(departments[item], mediator);
				}
				else {
					
					System.out.println("Invitation message didn't send");
				}
				
				selectedfest.chiefGuest("Department Chair");
				selectedfest.addAgenda("Holy Quraan Recitation","8 AM");
				selectedfest.addAgenda("Bani Archona","9 AM");
				selectedfest.addAgenda("Industrial collaboration","10 AM");
				selectedfest.addAgenda("Project showcasing","12 AM");
				selectedfest.addAgenda("Break","1 PM");
				selectedfest.addAgenda("Cultural Program","2 PM");
				
				System.out.println("Select MediaPartner:\n1.Radio\n2.TV\n3.Newspaper");
				item=scr.nextInt()-1;
				
				MediaPartner select_mediaPartner=mp[item];
				selectedfest.setMediaPartner(select_mediaPartner);
				
				System.out.println("Start Ceremony?");
				s=scr.nextLine();
				s=scr.nextLine();
				
				if(s.equals("start")||s.equals("yes")) {
					
					selectedfest.startCeremony();
				}
				
				
				
			}
			
			
			
		}
		
	}
	
	public void createDepartmentObj() {
		
		
		DepartmentBuilder dpt=new IITDepartmentBuilder("IIT",mediator);
		dpt.setLocation();				
		dpt.setNumberOfStudent();
		dpt.setNumberOfTeacher();
		Department department=dpt.build();
		mediator.addDepartment(department);
		
		departments[0]=department;
		
		dpt=new CSEDepartmentBuilder("CSE",mediator);
		dpt.setLocation();				
		dpt.setNumberOfStudent();
		dpt.setNumberOfTeacher();
		department=dpt.build();
		mediator.addDepartment(department);
		
		departments[1]=department;
		
		dpt=new CSEDepartmentBuilder("Math",mediator);
		dpt.setLocation();				
		dpt.setNumberOfStudent();
		dpt.setNumberOfTeacher();
		department=dpt.build();
		mediator.addDepartment(department);
		departments[2]=department;
	}

}
