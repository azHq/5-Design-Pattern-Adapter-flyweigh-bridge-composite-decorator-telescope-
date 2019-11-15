package Bridge;

public class Templete {
	
	Remote remote;
	public Templete(Remote remote) {
		
		this.remote=remote;
	}
	
	public void getFunctionality() {
		
		remote.one();
		remote.two();
		remote.three();
		remote.four();
		remote.five();
	}

}
