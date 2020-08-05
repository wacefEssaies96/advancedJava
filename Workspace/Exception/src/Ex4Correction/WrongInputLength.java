package Ex4Correction;

public class WrongInputLength extends Exception{

	@Override
	public String toString() {
		return "trop de caractéres en entrée";
	}

}
