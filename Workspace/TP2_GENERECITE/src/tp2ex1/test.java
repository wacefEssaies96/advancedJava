package tp2ex1;

public class test {

	public static void main(String[] args) {
		
		
		Point< Number,String> p1 =new Point< Number,String>("P1",2,1);
        p1.affiche();
         
        Point<Number,String> p2 =new Point<Number,String>("P2",2.3,3.5); 
        p2.affiche();
         
        PointColor�NG pcng1=new PointColor�NG("pcng1",8,3,"Rouge");
        pcng1.affiche();
         
        PointColor�<String, Number, String> pc1 =new PointColor�<String, Number, String>(new Point<Number,String>("pc1",2,3),"Red");
	    pc1.affiche();
	     
	    PointColor�<CouleurRVB, Number, String> pc2 =new PointColor�<CouleurRVB, Number, String>(new Point<Number,String>("pc2",2,3),new CouleurRVB(10,100,20));
	    pc2.affiche();
	     
	    Cercle<Number,String> c1=new Cercle <Number,String>(50,p1);
	    System.out.print(c1.toString());
	    
	     
	    CercleAvecRestriction<PointColor�NG> c2=new CercleAvecRestriction <PointColor�NG>(100,pcng1);
	    System.out.print(c2.toString());
	    CercleAvecRestriction<PointColor�> c3=new CercleAvecRestriction <PointColor�>(30,pc2);
	    System.out.print(c3.toString());
	     
	}
}
