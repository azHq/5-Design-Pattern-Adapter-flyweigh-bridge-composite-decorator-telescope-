package Decorator;

public class EncryptedFile extends DecoratedFile{

	
	public EncryptedFile(IFile file) {
		super(file);
		
	}

	public void encryptFile() {
		
		System.out.println("encrypting file");
		
	}
	
	@Override
	public void readFile() {
		//decrypt
		super.readFile();
	}
	
	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		super.writeFile();
		encryptFile();
	}

	
}
