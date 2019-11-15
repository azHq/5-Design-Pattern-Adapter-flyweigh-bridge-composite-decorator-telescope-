package Decorator;

public class PasswordProtectedFile extends DecoratedFile{

	
	public PasswordProtectedFile(IFile file) {
		
		super(file);
		
	}
	
	public void passwordProtect() {
		
		
		System.out.println("file protect by password");
		
	}
	
	public void passwordExtract() {
		
		
		System.out.println("Extract password");
		
	}

	
	@Override
	public void readFile() {
		passwordExtract();
		super.readFile();
	}
	
	@Override
	public void writeFile() {
		passwordProtect();
		super.writeFile();
		
	}
}
