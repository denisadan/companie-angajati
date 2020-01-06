public class Marketing extends Departament implements Evaluator {
	
	public Marketing() {
		super("Marketing", 6);
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
