package tp2ex1;

public class Cercle<t1,N> {
	
	private int ray;
	private Point<t1,N> centre;
	
	public Cercle(int ray, Point<t1,N> centre) {
		this.ray = ray;
		this.centre = centre;
	}
	
	public String toString() {
		return "\n Cercle [ray=" + ray + ", centre=" + centre +"]";
	}
	
	public int getRay() {
		return ray;
	}
	
	public void setRay(int ray) {
		this.ray = ray;
	}
	
	public Point<t1, N> getCentre() {
		return centre;
	}
	
	public void setCentre(Point<t1, N> centre) {
		this.centre = centre;
	}

}
