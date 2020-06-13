package tp2ex1;

public class test {

	public static void main(String[] args) {
		
		
		Point< Number,String> p1 =new Point< Number,String>("P1",2,1);
        p1.affiche();
         
        Point<Number,String> p2 =new Point<Number,String>("P2",2.3,3.5); 
        p2.affiche();
         
        PointColoréNG pcng1=new PointColoréNG("pcng1",8,3,"Rouge");
        pcng1.affiche();
         
        PointColoré<String, Number, String> pc1 =new PointColoré<String, Number, String>(new Point<Number,String>("pc1",2,3),"Red");
	    pc1.affiche();
	     
	    PointColoré<CouleurRVB, Number, String> pc2 =new PointColoré<CouleurRVB, Number, String>(new Point<Number,String>("pc2",2,3),new CouleurRVB(10,100,20));
	    pc2.affiche();
	     
	    Cercle<Number,String> c1=new Cercle <Number,String>(50,p1);
	    System.out.print(c1.toString());
	    
	     
	    CercleAvecRestriction<PointColoréNG> c2=new CercleAvecRestriction <PointColoréNG>(100,pcng1);
	    System.out.print(c2.toString());
	    CercleAvecRestriction<PointColoré> c3=new CercleAvecRestriction <PointColoré>(30,pc2);
	    System.out.print(c3.toString());
	     
	}
}
