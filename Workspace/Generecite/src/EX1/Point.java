package EX1;

public class Point <t> {
	
 private t abs;
 private t ord;

 Point(){
	 this.abs=this.ord=null; 
 }
 public Point(t abs,t ord){
		this.abs=abs;
		this.ord=ord;
 }
 
 public t getAbs() {
	return abs;
}
public void setAbs(t abs) {
	this.abs = abs;
}
public t getOrd() {
	return ord;
}
public void setOrd(t ord) {
	this.ord = ord;
}

 public void affiche() {
	System.out.println("("+abs+","+ord+")"); 
 }
 
}
