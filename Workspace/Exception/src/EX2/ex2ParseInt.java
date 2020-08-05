package EX2;
import java.util.Scanner;
public class ex2ParseInt {
	
	public static void main(String args[]) {
		String s;
		int entier;
		try {
			Scanner clavier = new Scanner(System.in);
			s = clavier.nextLine();
			clavier.close();
			/*entier = parseInt(s);
			System.out.println(entier);*/
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	
	public static int parseInt (String s) throws NumberFormatException{
		
		return 0 ;
	}
}
