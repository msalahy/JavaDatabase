
import java.util.*;
import java.util.regex.*;
public class RegExpr {

	public static void main (String args) {
		
		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat = Pattern.compile("Java");
		mat = pat.matcher("Java");
		
		found = mat.matches();
		
		System.out.println("Testing Java against Java.");
		if(found)
			System.out.println("Yes matches");
		else
			System.out.println("No Mathces");
		
		System.out.println();
		
		
		System.out.println("Testing Java against Java SE 6.");
		mat = pat.matcher("Java Se 6");
		found = mat.matches();
		
		if(found)
			System.out.println("Yes matches");
		else
			System.out.println("No Mathces");
	}
	
}
