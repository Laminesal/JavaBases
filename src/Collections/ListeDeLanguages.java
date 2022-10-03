package Collections;

import java.util.ArrayList;

/*
 * Écrivez un programme Java pour créer un ArrayList nommé « languages »,
 *  ajoutez des chaîne(Ex: PHP, Java, C++, Python) et affichez la collection.
 * 
 * */
import java.util.List;

public class ListeDeLanguages {

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<String>();
		
		languages.add("PHP");
		languages.add("C++");
		languages.add("JAVA");
		languages.add("Phython");
		
		System.out.println(languages);

	}

}
