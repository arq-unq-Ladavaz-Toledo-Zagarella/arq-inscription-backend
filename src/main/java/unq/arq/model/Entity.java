package unq.arq.model;

import java.io.Serializable;

public abstract class Entity implements Serializable {

	private static final long serialVersionUID = 8444671486174747182L;
	private int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id= id;
	}
}
