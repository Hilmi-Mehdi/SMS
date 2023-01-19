package classes;

import java.util.ArrayList;

public class Filiere {

	private int id;
	private String nom;
	private String abreviation;
	private ArrayList<Modul> moduls;
	private ArrayList<Niveau> nv;
	public ArrayList<Niveau> getNv() {
		return nv;
	}
	public void setNv(ArrayList<Niveau> nv) {
		this.nv = nv;
	}
	public ArrayList<Modul> getAuthors() {
		return moduls;
	}
	public void setAuthors(ArrayList<Modul> authors) {
		this.moduls = authors;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAbreviation() {
		return abreviation;
	}
	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}
	public Filiere(int id, String nom, String abreviation) {
		super();
		this.id = id;
		this.nom = nom;
		this.abreviation = abreviation;
		this.moduls = new ArrayList<Modul>();
		this.nv = new ArrayList<Niveau>();
	}
	
	
}
