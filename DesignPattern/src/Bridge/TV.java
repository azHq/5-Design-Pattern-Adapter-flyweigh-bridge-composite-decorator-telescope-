package Bridge;

public class TV extends Device {

	public TV() {
		
	}
	@Override
	public void three() {
		
		System.out.println("next channel");
		
	}

	@Override
	public void four() {
		
		System.out.println("previous channel");
	}
}
