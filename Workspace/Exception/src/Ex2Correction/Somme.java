package Ex2Correction;

public class Somme {

	public static void main(String[] args) {
		int somme = 0;
		for(int i=0;i<args.length;i++) {
			try { 
					somme += Integer.parseInt(args[i]); 
			}
			catch (NumberFormatException e) {
				System.out.println("Format invalide");
				System.out.println("le message officiel "+e.getMessage());
				
			}
		}
		System.out.println(somme);}

}
