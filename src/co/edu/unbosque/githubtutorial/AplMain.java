package co.edu.unbosque.githubtutorial;



import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;



public class AplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Date currentDate = new Date();
		
			System.out.println("Hola mundo y Hola Paula morena divina ;)");
			System.out.println("The current date is"+ currentDate.toString());

			String enterLastName = "";
			String enterName = "";
		
	        Scanner lastName = new Scanner (System.in); 

	        enterLastName = lastName.nextLine ();

		Scanner entradaEscaner = new Scanner (System.in); 

	        enterName = entradaEscaner.nextLine ();

	        
		
		System.out.println("Enter your last name");
	        System.out.println ("your name is: \"" + enterName +"\"");
		
	        System.out.println ("write your name:");
		 System.out.println ("Your last name is: \""+ enterLastName +"\"");
		}
	}


