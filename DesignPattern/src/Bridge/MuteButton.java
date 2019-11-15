package Bridge;

public class MuteButton extends Remote {

	public MuteButton(Device device) {
		super(device);
		
	}

	@Override
	public void five() {
		
		System.out.println("five Mute");
		
	}

}
