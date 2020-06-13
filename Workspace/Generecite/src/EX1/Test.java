package EX1;

public class Test {
	public static void main(String[] args) {
		Point <Integer> p1 = new Point(1, 5.6);
		Point <Integer> p2 = new Point(2.5, 5.6);
		PointColoreNG pcng1=new PointColoreNG("pcng1",3,5);
		pcng1.affiche();
		
		p1.affiche();
		p2.affiche();
	}
}
