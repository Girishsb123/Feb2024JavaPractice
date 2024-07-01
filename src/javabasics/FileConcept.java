package javabasics;

public class FileConcept {

	static String name;// static class var
	int fileSize;// instance var

	public static void readFile() {
		System.out.println("read - file");
	}

	public void writeFile() {
		System.out.println("write - file");
	}

	public static void main(String[] args) {

		// 1.direct call
		readFile();
		// 2.using class name
		FileConcept.readFile();

		FileConcept fc = new FileConcept();
		fc.writeFile();
		fc.readFile();// not recommended

	}

}
