package Composite;

import java.util.ArrayList;
import java.util.List;

/*
 * 对象通过实现（继承）统一的接口（抽象类），调用者对单一对象和组合对象的操作具有一致性。
 */
public class Composite {
	public static void main(String[] args) {
		File a = new File("/user/a");
		File b = new File("/user/b");
		FileDirectory c = new FileDirectory("/user/c");
		File d = new File("/user/c/d");
		c.addFile(d);
		File e = new File("/e");
		FileDirectory fileDirectory = new FileDirectory("/user");
		fileDirectory.addFile(a);
		fileDirectory.addFile(b);
		fileDirectory.addFile(c);

		List<Data> datas = new ArrayList<Data>();
		datas.add(fileDirectory);
		datas.add(e);

		for (Data data : datas) {
			if (data instanceof File)
				visitFile((File) data);
			else
				visitFileDirectory((FileDirectory) data);
		}
	}

	private static void visitFileDirectory(FileDirectory fileDirectory) {
		fileDirectory.visit();
		for (Data data : fileDirectory.getFiles()) {
			if (data instanceof File)
				visitFile((File) data);
			else
				visitFileDirectory((FileDirectory) data);
		}
	}

	private static void visitFile(File file) {
		file.visit();
	}
}
