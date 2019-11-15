package Bridge;

public class DVD extends Device {

	public DVD() {
		
	}
	@Override
	public void three() {
		
		System.out.println("next viedo");
		
	}

	@Override
	public void four() {
		
		System.out.println("previous channel");
	}

}
