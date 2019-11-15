package Decorator;

public class File implements IFile {
	
	String path;
	public File(String path) {
		
		this.path=path;
	}

	
	@Override
	public void readFile() {
		
		System.out.println("Read File");
		
	}

	@Override
	public void writeFile() {
		
		System.out.println("Write File");
		
	}

}
