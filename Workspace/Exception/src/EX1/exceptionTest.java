/*
 * a : Le programme s'est bien execut�
 * b : Le message "fin du programme est bien affich�"
 * c : L'exception lev� sur la machine est "ArithmeticException"
 * d : Oui, une exception a �t� l�v�
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
			System.out.println("oops ! un probl�me dans la division");
			System.out.println ("le message officiel est " + e.getMessage()) ;
		}
			
		finally {
			System.out.println("le bloc finally sera toujours ex�cut�") ;
			System.out.println("c'est l� qu'on fermera par exemple les fichiers") ;
			}
		}
		

}
