package Basique;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrer un nombre: ");
		Float a = scanner.nextFloat();
		
		System.out.println("Entrer un deuxieme nombre: ");
		Float b = scanner.nextFloat();
	
		Float division = a / b;
		
		System.out.println("La division des deux nombres entrés est: "+division);
	}

}
