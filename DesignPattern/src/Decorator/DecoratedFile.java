package Decorator;

public abstract class DecoratedFile implements IFile {

	IFile file;
	public DecoratedFile(IFile file) {
		
		this.file=file;
	}
	@Override
	public void readFile() {
		
		file.readFile();
	}

	@Override
	public void writeFile() {
		
		file.writeFile();
	}
}