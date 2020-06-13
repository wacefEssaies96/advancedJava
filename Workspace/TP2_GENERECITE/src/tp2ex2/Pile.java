package tp2ex2;

interface Pile <P>{
	public boolean estVide();
	public P dernier();
	public void depiler();
	public void empiler(P o);
}