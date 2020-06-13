package tp2ex1;

public class PointColoréNG extends Point<Number ,String>{
	
	private String couleur;
	
	
	public PointColoréNG(String nom,int abs,int ord,String col) {
		super(nom,abs,ord);
		this.couleur=col;
	}
	
	public String toString() {
		return "\nPointColoréNG : "+super.toString()+" et de couleur "+couleur;
	}
	
	public void affiche() {
		System.out.println("\nPointColoréNG : ");
		super.affiche();
		System.out.println(" et de couleur "+this.couleur); 
	 }
	
	public String getCouleur() {
		return couleur;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
}
