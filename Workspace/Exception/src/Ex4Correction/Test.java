package Ex4Correction;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Authentification a;
		boolean erreur=true;
		while(erreur)
		try{
			
			a=new Authentification();
			erreur=false;
			System.out.println("login et mot de passe corrects");
			
		}
		catch(WrongInputLength e){
			System.out.print(e);
			
			
		}
		catch(WrongLoginException e){
			System.out.print(e);
			
			
		}
		catch(WrongpwdException e){
			System.out.print(e);
			
			
		}
		catch(IOException e){
			//System.out.print(e.toString());
		e.getStackTrace();	
			
		}
		catch(Exception e){
			//System.out.print(e.toString());
		e.getStackTrace();	
			
		}
		
		

	}

}
