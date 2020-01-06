public class Candidat {
	private String nume;
	private String prenume;
	private int nivelDeCompetenta;
	private String numeDepartament;
	private StatusCandidat statusCandidat;
	
	public Candidat() {
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public int getNivelDeCompetenta() {
		return nivelDeCompetenta;
	}
	
	public void setNivelDeCompetenta(int nivelDeCompetenta) {
		this.nivelDeCompetenta = nivelDeCompetenta;
	}
	
	public String getNumeDepartament() {
		return numeDepartament;
	}
	
	public void setNumeDepartament(String numeDepartament) {
		this.numeDepartament = numeDepartament;
	}
	
	public StatusCandidat getStatusCandidat() {
		return statusCandidat;
	}
	
	public void setStatusCandidat(StatusCandidat statusCandidat) {
		this.statusCandidat = statusCandidat;
	}
	
	public Candidat(String nume,
					String prenume,
					int nivelDeCompetenta,
					String numeDepartament) {
		this.nume = nume;
		this.prenume = prenume;
		this.nivelDeCompetenta = nivelDeCompetenta;
		this.numeDepartament = numeDepartament;
		this.statusCandidat = StatusCandidat.IN_ASTEPTARE;
	}
	
	@Override
	public String toString() {
		return "\nCandidat{" +
				"nume='" + nume + '\'' +
				", prenume='" + prenume + '\'' +
				", nivelDeCompetenta=" + nivelDeCompetenta +
				", numeDepartament='" + numeDepartament + '\'' +
				", statusCandidat=" + statusCandidat +
				'}';
	}
}
