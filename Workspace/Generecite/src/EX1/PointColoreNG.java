package EX1;

public class PointColoreNG extends Point<Number> {
	private String couleur;
	
	public PointColoreNG(String couleur,int abs,int ord) {
		super(abs,ord);
		this.couleur = couleur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public void affiche() {
		super.affiche();
		System.out.println("Couleur : "+this.couleur);
	}
}



