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
			System.out.println ("Por favor escriba su nombre:");

	        String entradaTeclado = "";

	        Scanner entradaEscaner = new Scanner (System.in); 

	        entradaTeclado = entradaEscaner.nextLine ();

	        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
	        
		}
	}


