package classes;

import java.util.ArrayList;

public class Classe {
	
	private int id;
	private String code;
	private String anneeScolaire;
	private ArrayList<Horaire> hr;
	private ArrayList<Etudiant> et;
	public ArrayList<Etudiant> getEt() {
		return et;
	}
	public void setEt(ArrayList<Etudiant> et) {
		this.et = et;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	private Niveau niveau;
	public ArrayList<Horaire> getHr() {
		return hr;
	}
	public void setHr(ArrayList<Horaire> hr) {
		this.hr = hr;
	}
	public Classe(int id, String code, String anneeScolaire) {
		super();
		this.id = id;
		this.code = code;
		this.anneeScolaire = anneeScolaire;
		this.hr = new ArrayList<Horaire>();
		this.et = new ArrayList<Etudiant>();
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
	public String getAnneeScolaire() {
		return anneeScolaire;
	}
	public void setAnneeScolaire(String anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}

}
