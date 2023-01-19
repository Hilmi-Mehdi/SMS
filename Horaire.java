package classes;

import java.util.Date;

public class Horaire {
	
	private int id;
	private String jour;
	private Date heureDebut;
	private Date heureFin;
	private Classe classe;
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
	}
	public Date getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}
	public Date getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}
	public Horaire(int id, String jour, Date heureDebut, Date heureFin) {
		super();
		this.id = id;
		this.jour = jour;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
	}
	
	

}
