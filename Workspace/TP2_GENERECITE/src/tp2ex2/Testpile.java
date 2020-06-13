package tp2ex2;

class TestPile{
	public static void main(String[]args){

		System.out.println("///////  Pile de Number  ///////////");
		
		PileListe<Number> p = new PileListe<Number>();

		 //remplir la pile de 1 a 5
		for(int i = 1 ; i < 6 ; i++){
			p.empiler(new Integer(i));
		} 
		//affichage et depiler
		System.out.println("----------Pile p  --------");
		 while(!p.estVide()){
			 System.out.println((Integer) p.dernier());
			 p.depiler();
		}
		 
		System.out.println("///////  Pile de String  ///////////");
			
		PileListe<String> p1 = new PileListe<String>();
			
		for(int i = 0 ; i < 10 ; i++){
			p1.empiler("la case "+i);
		}
		//affichage et depiler
		System.out.println("----------Pile p1  --------");
		while(!p1.estVide()){
			System.out.println((String) p1.dernier());
			p1.depiler();
		}
	}
}