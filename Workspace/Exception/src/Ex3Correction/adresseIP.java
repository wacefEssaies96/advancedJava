package Ex3Correction;
public class adresseIP {
	private int[] octet;
	 public adresseIP (int o1,int o2, int o3, int o4) throws ExceptionAdrIP {
	   if (o1 < 0 || o1 > 255)
	    throw new ExceptionAdrIP("valeur incorrecte pour le premier octet");
	   if (o2 < 0 || o2 > 255)
	    throw new ExceptionAdrIP("valeur incorrecte pour le deuxième octet");
	   if (o3 < 0 || o3 > 255)
	    throw new ExceptionAdrIP("valeur incorrecte pour le troisième octet");
	   if (o4 < 0 || o4 > 255)
	    throw new ExceptionAdrIP("valeur incorrecte pour le quatrième octet");
	   
	   octet = new int[] {o1,o2,o3,o4};
	  }
	  public String toString(){
	  return octet[0] + "." + octet[1] + "." + octet[2] + "."+ octet[3]
	 ;
	  }
	  public static void main(String[] args) {
	  adresseIP adr;
	  try {
	   adr = new adresseIP(2551,168,192,10);
	   System.out.println(adr);
	  } catch (ExceptionAdrIP e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  } 
	  }
}