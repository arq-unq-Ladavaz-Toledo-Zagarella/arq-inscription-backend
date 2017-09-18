package unq.arq.model;

public class Subject extends Entity {

	private static final long serialVersionUID = -3315990833455036931L;
	private String name;
	
	public Subject() { }
	
	public Subject(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name= name;
	}
}
