package unq.arq.model;

public class Student extends Entity {

	private static final long serialVersionUID = -1145645752787029888L;
	private String name;
	private int fileNumber;

	public Student() {  super(); }
	
	public Student(String name, int fileNumber) {
		setName(name);
		setFileNumber(fileNumber);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name= name;
	}

	public int getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(int fileNumber) {
		this.fileNumber= fileNumber;
	}
}
