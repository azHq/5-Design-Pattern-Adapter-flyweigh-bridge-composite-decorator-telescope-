package Bridge;

public class PauseButton extends Remote {

	public PauseButton(Device device) {
		super(device);
		
	}

	@Override
	public void five() {
		
		System.out.println("five pause");
		
	}

}
