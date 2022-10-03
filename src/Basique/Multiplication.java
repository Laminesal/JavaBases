package Basique;

import java.util.Scanner;

public class Multiplication {

	public static void main(String ... args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrer votre premier nombre: ");
		Integer n1 = scanner.nextInt();
		
		System.out.println("Entrer votre deuxieme nombre: ");
		Integer n2 = scanner.nextInt();
		
		Integer result =  n1*n2;
		
		System.out.println("Votre mutiplication est: "+ result);
	}
}
