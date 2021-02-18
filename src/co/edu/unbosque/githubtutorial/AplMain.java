package co.edu.unbosque.githubtutorial;



import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;



public class AplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Date currentDate = new Date();
		
			System.out.println("Hola mundo y Hola Paula morena divina)");
			System.out.println("The current date is "+ currentDate.toString());
			
			
			System.out.println ("write your name:");
			String enterName = "";
			Scanner name = new Scanner (System.in); 
			enterName = name.nextLine ();
			
			System.out.println("Enter your last name");
			String enterLastName = "";
	        	Scanner lastName = new Scanner (System.in); 
	        	enterLastName = lastName.nextLine ();

	        System.out.println ("your name is: \"" + enterName +"\"");
	        
	        System.out.println ("Your last name is: \""+ enterLastName +"\"");
	        
		}
	}
