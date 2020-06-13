package tp2ex1;

public class CouleurRVB {
	
	private int R;
    private int V;
	private int B;
   
	public CouleurRVB(int r, int v, int b) {
		R = r;
		V = v;
		B = b;
	}

	public String toString() {
		return "CouleurRVB [R=" + R + ", V=" + V + ", B=" + B + "]";
	}
   
	public int getR() {
		return R;
	}
	
	public void setR(int r) {
		R = r;
	}
	
	public int getV() {
		return V;
	}
	
	public void setV(int v) {
		V = v;
	}
	
	public int getB() {
		return B;
	}
	
	public void setB(int b) {
		B = b;
	}
	
	
}
