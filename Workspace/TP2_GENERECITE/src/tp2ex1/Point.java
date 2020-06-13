package tp2ex1;


public class Point <t1,N> {
	
	 private t1 abs;
	 private t1 ord;
	 private N nom;

	 public Point(){
		 this.abs=null;
		 this.ord=null; 
	 }

	 public Point(N nom,t1 abs,t1 ord){
		this.abs=abs;
		this.ord=ord;
		this.nom=nom;
	 }

	 public Point(t1 abs,t1 ord){
			this.abs=abs;
			this.ord=ord;
	 }

	 public Point(Point <t1,N> x){
		this.abs=x.abs;
		this.ord=x.ord;
		this.nom=x.nom;
	 }
	 
	public String toString() {
		return "\n "+nom+" ( Abs :"+abs+" , Ord :"+ord+")"; 
	}
	
	public void affiche() {
		System.out.println("\n"+ nom+" ( Abs :"+abs+" , Ord :"+ord+")"); 
	}
	public t1 getAbs() {
		return abs;
	}
	 
	public void setAbs(t1 abs) {
		this.abs = abs;
	}
	
	public t1 getOrd() {
		return ord;
	}
		
	public void setOrd(t1 ord) {
		this.ord = ord;
	}
	
	public N getNom() {
		return nom;
	}
	
	public void setNom(N nom) {
		this.nom = nom;
	}
 
}
