package Decorator;

public class DecryptedFile extends DecoratedFile {

	public DecryptedFile(IFile file) {
		super(file);
		
	
	}
	
	public void decryptFile() {
		
		
		System.out.println("Decrypt file");
		
	}
	
	@Override
	public void readFile() {
		decryptFile();
		super.readFile();
	}
	
	@Override
	public void writeFile() {
		// encrypt
		super.writeFile();
		
	}

}
