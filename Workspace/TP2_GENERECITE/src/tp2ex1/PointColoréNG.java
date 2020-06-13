package tp2ex1;

public class PointColor�NG extends Point<Number ,String>{
	
	private String couleur;
	
	
	public PointColor�NG(String nom,int abs,int ord,String col) {
		super(nom,abs,ord);
		this.couleur=col;
	}
	
	public String toString() {
		return "\nPointColor�NG : "+super.toString()+" et de couleur "+couleur;
	}
	
	public void affiche() {
		System.out.println("\nPointColor�NG : ");
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
