package Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Écrivez un programme Java pour récupérer le 
 * troisième élément à partir d’un ArrayList.
 * */

public class RecupereList {
	
	public static void main(String ...args) {
		
		List<String> languages = new ArrayList<>();
		
		languages.add("JAVA");
		languages.add("PHP");
		languages.add("C++");
		
		String lang = languages.get(2);
		
		System.out.println(lang);
	}

}
