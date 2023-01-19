package classes;

public class Resultat {

	private int id;
	private float note;
	private Examen examen;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	
	public Examen getExamen() {
		return examen;
	}
	public void setExamen(Examen examen) {
		this.examen = examen;
	}
	public Resultat(int id, float note) {
		super();
		this.id = id;
		this.note = note;
	}
}
