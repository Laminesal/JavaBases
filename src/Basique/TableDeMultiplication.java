package Basique;

import java.util.Scanner;

public class TableDeMultiplication {
/**
 * 
 * Écrivez un programme Java qui prend un nombre en entrée et affiche sa table de multiplication jusqu’à 10.
 * 
 * */
	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez rentrer un nombre : ");
		
		Integer a = scanner.nextInt();
		
		for(Integer i = 1; i<11; i++) {

		Integer result = i * a ;
		
		System.out.println(a+"X"+i+"="+result);
		
		}
	}

}
