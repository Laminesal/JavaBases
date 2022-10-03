package Collections;

import java.util.ArrayList;
import java.util.List;
/**
 * Écrivez un programme Java pour parcourir tous les éléments d’un
 *  ArrayList, en utilisant la boucle for.
 * 
 * */
public class ParcourirMaList {

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<>();
		
		languages.add("PHP");
		languages.add("JAVA");
		languages.add("C++");
		languages.add("Phyton");
		
		for(String i : languages) {
			System.out.println(i);
		}

	}

}
