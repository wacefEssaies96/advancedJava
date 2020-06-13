package tp2ex1;

public class PointColoré<T2,t1,N> extends Point<t1,N> {
	
	private T2 couleur;	

	public PointColoré(Point<t1,N> p,T2 col) {
		super(p);
		this.couleur=col;
	}
	
	public String toString() {
		return "\nPointColoré : "+super.toString()+" et de couleur "+couleur;
	}
	
	public void affiche() {
		System.out.println("\nPointColoré : ");
		super.affiche();
		System.out.println(" et de couleur "+this.couleur); 
	 }
	
	public T2 getCouleur() {
		return couleur;
	}

	public void setCouleur(T2 couleur) {
		this.couleur = couleur;
	}
}
