package Bridge;

public abstract class Remote {
	
	Device device;
	public Remote(Device device) {
		
		this.device=device;
	}
	
	public void one() {
		
		device.one();
	}

	public void two() {
		
		device.two();
	}
	
	public void three() {
		
		device.three();
	}
	
	public void four() {
		
		device.four();
	}
	
	public abstract void five();



}
