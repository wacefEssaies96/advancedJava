
public class PointColor�NG extends Point<String, Number>{
private String couleur;
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
public PointColor�NG(String nom,int a,int o,String col) {
	super(nom,a,o);
	this.couleur=col;
}
public void affiche() {
	super.affiche();
	System.out.println(" est de couleur "+this.couleur); 
 }
@Override
public String toString() {
	return "PointColor�NG [couleur=" + couleur + ", getCouleur()=" + getCouleur() + ", getAbs()=" + getAbs()
			+ ", getOrd()=" + getOrd() + ", getNom()=" + getNom() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}

}
