package tp2ex1;

public class CercleAvecRestriction <C>{
	
	private int rayon;
	private C centre;

	
	public CercleAvecRestriction(int rayon, C centre) {
		this.rayon = rayon;
		this.centre = centre;
	}
	
	public String toString() {
		return "\n\n CercleAvecRestriction [rayon=" + rayon + ", centre=" + centre + "]";
	}
	
	public int getRayon() {
		return rayon;
	}
	
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	
	public C getCentre() {
		return centre;
	}
	
	public void setCentre(C centre) {
		this.centre = centre;
	}

}
