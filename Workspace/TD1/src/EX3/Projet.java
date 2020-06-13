package EX3;

import java.util.Scanner;

public class Projet {
	
	String nom;
	int duree;
	private String sujet;
	
	public Projet(){
    
	}	
 
	@Override
	public String toString() {
		return "Projet [nom=" + nom + ", duree=" + duree + ",sujet=" + sujet + "]";
	}

	public int readInt() throws WrongDurationException{
		Scanner sc = new Scanner(System.in);
		String strNumber =sc.nextLine();
		int duree=0;
		try {
			duree=Integer.parseInt(strNumber );
		}catch(NumberFormatException e) {
			System.out.println(e.toString());
		}
		
		if(duree <= 0 ) {
			throw new WrongDurationException();
		}
		return duree;
	}

	private String readString() throws NameTooLongException {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.length() > 10) {
			throw new NameTooLongException();
		}
		return str;
	}
    
	public void readProject() throws NameTooLongException, WrongDurationException {
		do {
			System.out.println("Donnez le nom du projet : ");
			try {
				nom = readString(); 
			}catch(NameTooLongException e) {
				   System.out.println(e.toString());
			}
		}while(nom == null);   
		do {
			System.out.println("Donnez le sujet du projet : ");
			try {
		        this.sujet = readString();
			}catch(NameTooLongException e) {
				System.out.println(e.toString());
			}
		}while(sujet == null);
		    
		do {
			System.out.println("Donnez la durée du projet : ");
			try {
			this.duree = readInt();
			}catch(WrongDurationException e) {
			System.out.println(e.toString());
			}
		}while(duree<=0);
	}
}
