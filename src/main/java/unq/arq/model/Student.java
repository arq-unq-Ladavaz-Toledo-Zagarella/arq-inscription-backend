package unq.arq.model;

public class Student extends Entity {

	private static final long serialVersionUID = -1145645752787029888L;
	private String username;
	private String password;
	private String name;
	private String lastName;
	private int dni;

	public Student() {  super(); }
	
	public Student(String username, String password, String name, String lastName, int dni) {
		setUsername(username);
		setPassword(password);
		setName(name);
		setLastName(lastName);
		setDni(dni);
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username= username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password= password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
}
