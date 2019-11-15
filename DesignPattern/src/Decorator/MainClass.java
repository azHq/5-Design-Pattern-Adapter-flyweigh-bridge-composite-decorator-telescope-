package Decorator;

public class MainClass {
	
	public static void main(String[] args) {
		
		IFile file=new PasswordProtectedFile(new EncryptedFile(new DecryptedFile(new File("azaz/a/b/abc.txt"))));
		file.readFile();
	}

}
