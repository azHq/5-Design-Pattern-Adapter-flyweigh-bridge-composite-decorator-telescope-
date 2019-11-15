package Bridge;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("1.DVD Functionality\n2.TV Functionality");
		Scanner scr=new Scanner(System.in);
		
		while(true) {
			
			int x=scr.nextInt();
			
			
			if( x==1) {
				
				System.out.println("1.DVD Mute\n2.DVD Pause");
				int y=scr.nextInt();
				
				Templete temp;
				if(y==1) {
					temp=new Templete(new MuteButton(new DVD()));
					temp.getFunctionality();
				}
				else {
					
					temp=new Templete(new PauseButton(new DVD()));
					temp.getFunctionality();
				}
				
			}
			if( x==2) {
				
				System.out.println("1.TV Mute\n2.TV Pause");
				int y=scr.nextInt();
				
				Templete temp;
				if(y==1) {
					temp=new Templete(new MuteButton(new TV()));
					temp.getFunctionality();
					
				}
				else {
					
					temp=new Templete(new PauseButton(new TV()));
					temp.getFunctionality();
				}
			}
			
		}
		
	}

}
