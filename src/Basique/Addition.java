package Basique;

import java.util.Scanner;

/**
 * 
 * Écrivez un programme Java pour afficher la somme de deux nombres.
 * */
public class Addition {

	public static void main(String[] args) {
		
		
					
		Scanner scanner = new Scanner (System.in);
				
		System.out.println("Entrer le premier nombre: ");
		Integer a = scanner.nextInt();
		
		System.out.println("Entrer le second nombre:");
		
		Integer b = scanner.nextInt();
		
		Integer result = a+b;
		
		System.out.println("La somme des deux nombres est = "+ result);
		
	

		
	}

}
