package classes;

import java.util.ArrayList;

public class Niveau {
	
	private int id;
	private String code;
	private Filiere filiere;
	private ArrayList<Classe> cl;
	public ArrayList<Classe> getCl() {
		return cl;
	}
	public void setCl(ArrayList<Classe> cl) {
		this.cl = cl;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Niveau(int id, String code) {
		super();
		this.id = id;
		this.code = code;
		this.cl = new ArrayList<Classe>();
	}
	

}
