package EX1;

public class PointColore<T2,t> extends Point<t>{
	private T2 couleur;

	public T2 getCouleur() {
		return couleur;
	}

	public void setCouleur(T2 couleur) {
		this.couleur = couleur;
	}
	public PointColore(Point<t> p,T2 col) {
		super();
		this.couleur=col;
	}
	
	@Override
	public String toString() {
		return "PointColor� [couleur=" + couleur + ", getCouleur()=" + getCouleur() + ", getAbs()=" + getAbs()
				+ ", getOrd()=" + getOrd() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void affiche() {
		super.affiche();
		System.out.println(" est de couleur "+this.couleur); 
	 }

}
