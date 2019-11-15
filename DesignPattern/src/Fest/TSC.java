package Fest;

public class TSC {
	
	private static TSC tsc=new TSC();
	private static int availableDays=5;
	private static boolean booked=false;
	
	
	private TSC() {
		
	}
	
	public static TSC getInstance(int days) {
		
		if(availableDays-days>0) {
			
			availableDays=availableDays-days;
			booked=true;
			return tsc;
		}
		else {
			
			booked=false;
			return tsc;
		}
		
	}
	
	public  int getAvailableDays() {
		
		return availableDays;
	}
	public boolean getBook() {
		
		return booked;
	}

}
