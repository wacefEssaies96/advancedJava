package Ex4Correction;

import java.io.IOException;
import java.util.Scanner;

public class Authentification {
	final String LoginCorrect="scott";
	final String  PwdCorrect="tiger";
	public void getUserLogin() throws WrongInputLength,WrongLoginException,WrongpwdException,IOException {
		
		System.out.println("Login");
		Scanner sc =new Scanner(System.in);
		String l= sc.nextLine();
		if (l.length()>8) throw new WrongInputLength();
		if(!l.trim().equals(LoginCorrect)) throw new WrongLoginException();
		
		
		
	}
public void getUserPwd() throws WrongInputLength,WrongLoginException,WrongpwdException {
		
		System.out.println("Mot de passe");
		Scanner sc =new Scanner(System.in);
		String l= sc.nextLine();
		if (l.length()>8) throw new WrongInputLength();
		if(!l.trim().equals(PwdCorrect)) throw new WrongpwdException();
		
		
		
	}
public Authentification() throws WrongInputLength,WrongLoginException,WrongpwdException,IOException {
	{
	this.getUserLogin();
	this.getUserPwd();
	// TODO Auto-generated constructor stub
}


}}
