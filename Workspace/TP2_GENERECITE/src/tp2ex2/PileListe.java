package tp2ex2;

class PileListe<P> implements Pile<P>{
	
	private Noeud<P> sommet;


	public PileListe(){
		sommet = null;
	}
	
	public boolean estVide(){
		return (sommet == null);
	}
	
	public P dernier(){
		return sommet.info;
	}
	
	public void empiler(P o){
		Noeud<P> n = new Noeud<P>();
		n.info = o;
		n.suivant = sommet;
		sommet = n;
	}
	
	public void depiler(){
		sommet = sommet.suivant;
	}

}