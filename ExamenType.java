package classes;

import java.util.ArrayList;

public class ExamenType {
	
	private int id;
	private String type;
	private ArrayList<Examen> ex;
	public ArrayList<Examen> getEx() {
		return ex;
	}
	public void setEx(ArrayList<Examen> ex) {
		this.ex = ex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ExamenType(int id, String type) {
		super();
		this.id = id;
		this.type = type;
		this.ex = new ArrayList<Examen>();
	}

	
}
