
public class Application {
public static void main (String [] args){
	Context c = new Context();
	c.process(1);
	System.out.println("-----------------------------");
	c.process(2);
	System.out.println("-----------------------------");
	c.process(3);
	System.out.println("-----------------------------");
	c.process(10);
}
}
