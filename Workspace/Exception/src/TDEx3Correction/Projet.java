package TDEx3Correction;

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

	 public int readInt() {
	  Scanner sc = new Scanner(System.in);
	  String strNumber =sc.nextLine();
	  int duree=0;
	  duree=Integer.parseInt(strNumber );
	  return duree;
	 }

	    // methode utilitaire utilis'ee par readProject pour la
	    // lecture des String
	    private String readString()  {

	     Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	      
	        return str;
	    }
	    

	// La methode readProject redemande les donn'ees
	    // jsuqu'a ce qu'elles soient correctes
	    public void readProject() {
	       
	      
	            System.out.println("Donnez le nom du projet : ");
	           
	                nom = readString();
	           
	       

	      
	            
	                System.out.println("Donnez le sujet du projet : ");
	                this.sujet = readString();
	            
	            
	 


	            
	                System.out.println("Donnez la durée du projet : ");
	                this.duree = readInt();
	            
	      
	    }
	}





