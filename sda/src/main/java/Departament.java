public class Departament {
	private String nume;
	private int nivelMinimDeCompetente;
	
	public Departament(String nume, int nivelMinimDeCompetente) {
		this.nume = nume;
		this.nivelMinimDeCompetente = nivelMinimDeCompetente;
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public int getNivelMinimDeCompetente() {
		return nivelMinimDeCompetente;
	}
	
	public void setNivelMinimDeCompetente(int nivelMinimDeCompetente) {
		this.nivelMinimDeCompetente = nivelMinimDeCompetente;
	}
}
