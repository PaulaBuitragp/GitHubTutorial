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
System.out.println("Enter your last name");
			String enterLastName = "";

	        Scanner lastName = new Scanner (System.in); 

	        enterLastName = lastName.nextLine ();

	        System.out.println ("Your last name is: \""+ enterLastName +"\"");
			
=======
			System.out.println ("write your name:");

	        String entradaTeclado = "";

	        Scanner entradaEscaner = new Scanner (System.in); 

	        entradaTeclado = entradaEscaner.nextLine ();

	        System.out.println ("your name is: \"" + entradaTeclado +"\"");
	        
		}
	}


