package TDEx3Correction;

import java.util.Scanner;

public class Projet2 {
	 String nom;
	 int duree;
	 private String sujet;
	 public Projet2(){
	  
	  
	 }
	 
	 @Override
	 public String toString() {
	  return "Projet [nom=" + nom + ", duree=" + duree + ",sujet=" + sujet + "]";
	 }

	 public int readInt() throws  WrongDurationException{
	  Scanner sc = new Scanner(System.in);
	  String strNumber =sc.nextLine();
	  int duree=0;
	  try{
	  duree=Integer.parseInt(strNumber );}
	  catch (NumberFormatException e){
		 e.printStackTrace();
		  
	  }
	  
	 if (duree<=0) throw (new WrongDurationException("durée incorrect"));
	  
	  return duree;
	 }
	    // methode utilitaire utilis'ee par readProject pour la
	    // lecture des String
	    private String readString() throws NameTooLonException  {
	     Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        
	        
	        if (str.length()>10){
	        	throw new NameTooLonException("ne pas dépasser 10 caracteres");
	        }
	      
	        return str;
	    }
	// La methode readProject redemande les donn'ees
	    // jsuqu'a ce qu'elles soient correctes
	    public void readProject() throws NameTooLonException, WrongDurationException {
	       
	        do {
	            System.out.println("Donnez le nom du projet : ");
	           try{
	                nom = readString();
	           }
	           catch (NameTooLonException e){
	        	   System.err.println(e.getMessage());
	           }
	        } while (nom == null) ;

	        do {
	            
	                System.out.println("Donnez le sujet du projet : ");
	                try{
	                this.sujet = readString();}
	                catch (NameTooLonException e){
	 	        	   System.err.println(e.getMessage());
	 	           }
	            
	        } while (sujet==null);


	        do {
	            
	                System.out.println("Donnez la durée du projet : ");
	               try{ this.duree = readInt();}
	               catch (WrongDurationException e){
		        	   System.err.println(e.getMessage());
		           }
	            
	        } while (duree <= 0);
	    }

}
