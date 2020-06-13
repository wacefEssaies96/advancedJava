/*
 * a : Le programme s'est bien executé
 * b : Le message "fin du programme est bien affiché"
 * c : L'exception levé sur la machine est "ArithmeticException"
 * d : Oui, une exception a été lévé
 * e : Non, le message n'es pa apparu
 * 
 * 
*/
package EX1;

import java.util.Scanner;
public class exceptionTest {
		public static void main(String[] args) {
		int a, b, res;
		Scanner clavier = new Scanner(System.in);
		System.out.println("a =");
		a = clavier.nextInt();
		System.out.println("b =");
		b = clavier.nextInt();
		res = a / b;
		System.out.println(a + " / " + b + " = " + res);
		clavier.close();
		System.out.println ("Fin du programme") ;
		try {
			res = a / b;
			System.out.println(a + " / " + b + " = " + res);
		}
		catch( ArithmeticException e){
			System.out.println("oops ! un problème dans la division");
			System.out.println ("le message officiel est " + e.getMessage()) ;
		}
			
		finally {
			System.out.println("le bloc finally sera toujours exécuté") ;
			System.out.println("c'est là qu'on fermera par exemple les fichiers") ;
			}
		}
		

}
