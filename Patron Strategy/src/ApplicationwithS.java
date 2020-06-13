
import java.util.Scanner;


public class ApplicationwithS {
	public static void main (String [] args)throws Exception{
		ContextwithS c = new ContextwithS();
		c.process();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Donner le comportement:");
		String strategyClassName = scanner.nextLine();
		IStrategy s = (IStrategy)Class.forName(strategyClassName).newInstance();
			
		c.setStrategy(s);
		c.process();
		
		}
}
