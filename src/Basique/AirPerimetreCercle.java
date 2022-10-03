package Basique;

import java.util.Scanner;
/**
 * Écrivez un programme Java pour afficher l’aire et le périmètre d’un cercle.
 * *
 * */
public class AirPerimetreCercle{
public static void Calculer_aire_paire_Cercle(double rayon) {
	
	Scanner sc = new Scanner(System.in);
	//double r = sc.nextDouble() ; 
			
	double perimetre = 2 * Math.PI * rayon;
	
	double superficie = Math.PI * rayon * rayon;
	
	System.out.println("Le perimetre du cercle est: "+perimetre);
}
public static void main(String ...args) {
	Calculer_aire_paire_Cercle(5);
}
}