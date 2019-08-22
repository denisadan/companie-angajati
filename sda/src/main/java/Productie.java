public class Productie extends Departament implements Evaluator {
	
	public Productie() {
		super("Productie", 3);
	}
	
	public StatusCandidat evalueaza(Candidat candidat) {
		if (candidat.getNivelDeCompetenta() > super.getNivelMinimDeCompetente()) {
			return StatusCandidat.ACCEPTAT;
		} else if (candidat.getNivelDeCompetenta() < super.getNivelMinimDeCompetente()) {
			return StatusCandidat.RESPINS;
		} else {
			return StatusCandidat.IN_ASTEPTARE;
		}
	}
	
}
