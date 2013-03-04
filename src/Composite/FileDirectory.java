package Composite;

import java.util.ArrayList;
import java.util.List;

public class FileDirectory extends Data {

	private List<Data> files;

	public FileDirectory(String name) {
		super(name);
		files = new ArrayList<Data>();
	}

	public void addFile(Data data) {
		files.add(data);
	}
	
	public List<Data> getFiles() {
		return files;
	}
}
