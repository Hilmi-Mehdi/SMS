package classes;

import java.util.ArrayList;
import java.util.Date;

public class Examen {
	private int id;
	private Date date;
	private Examen examen;
	private ArrayList<Resultat> rs;
	
	public Examen getExamen() {
		return examen;
	}
	public void setExamen(Examen examen) {
		this.examen = examen;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Examen(int id, Date date) {
		super();
		this.id = id;
		this.date = date;
		this.rs = new ArrayList<Resultat>();
	}
	public ArrayList<Resultat> getRs() {
		return rs;
	}
	public void setRs(ArrayList<Resultat> rs) {
		this.rs = rs;
	}

}
