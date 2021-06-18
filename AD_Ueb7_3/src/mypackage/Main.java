package mypackage;
import static mypackage.BoyerMoore.*;
import static mypackage.NaiveSearch.*;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		String pattern = "DATEN";
		String text = "ALGORTIHMEN UND DATENSTRUKTUREN IST SEHR SPANNEND FUER DATEN ABER NICHT FÜR EIN DATE";
		 System.out.println("Frequency of "+pattern+" in "+text+":" + naiveSearch(text, text.length(), pattern, pattern.length()));
		 System.out.println("Frequency of "+pattern+" in "+text+":" + boyerMooreSearch(text, text.length(), pattern, pattern.length()));
	}

}
