package Ex4Correction;

public class WrongpwdException extends Exception{

	@Override
	public String toString() {
		return "Mot de passe incorrect";
	}
	

}
