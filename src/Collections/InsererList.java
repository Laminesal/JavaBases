package Collections;

import java.util.ArrayList;
import java.util.List;
/*
 * Écrivez un programme Java pour insérer l’élément 
 * « Lamine » en première position dans l’ArrayList.
 * 
 * **/
public class InsererList {

	public static void main(String[] args) {
		
		
		List<String> languages = new ArrayList<>();
		
		languages.add("JAVA");
		languages.add("PHP");
		languages.add("PYTHON");
				
		languages.add(0, "Lamine");
	
		System.out.println(languages);

	}

}
