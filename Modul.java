package classes;

import java.util.ArrayList;

public class Modul {
	
	private int id;
	private String nom;
	private String abreviation;
	private int nbHeures;
	private int coefficient;
	private ArrayList<Filiere> fileres;
	private ArrayList<Employe> emp;
	public ArrayList<Employe> getEmp() {
		return emp;
	}
	public void setEmp(ArrayList<Employe> emp) {
		this.emp = emp;
	}
	public int getId() {
		return id;
	}
	public ArrayList<Filiere> getFileres() {
		return fileres;
	}
	public void setFileres(ArrayList<Filiere> fileres) {
		this.fileres = fileres;
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
	public int getNbHeures() {
		return nbHeures;
	}
	public void setNbHeures(int nbHeures) {
		this.nbHeures = nbHeures;
	}
	public int getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	public Modul(int id, String nom, String abreviation, int nbHeures, int coefficient) {
		super();
		this.id = id;
		this.nom = nom;
		this.abreviation = abreviation;
		this.nbHeures = nbHeures;
		this.coefficient = coefficient;
		this.fileres = new ArrayList<Filiere>();
		this.emp = new ArrayList<Employe>();
	}
	

}
