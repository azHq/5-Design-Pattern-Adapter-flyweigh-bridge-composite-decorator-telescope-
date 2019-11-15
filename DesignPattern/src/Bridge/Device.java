package Bridge;

public abstract class Device {
	
	public void one() {
		
		System.out.println("Volume UP");
	}
	public void two() {
		
		System.out.println("Volume Down");
	}
	public abstract  void three();
	public abstract  void four();

}
