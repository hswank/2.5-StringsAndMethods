
public class StringsAndMethods {

	public static void main(String[] args) {
		//capitalize
		String properCapitals = StringMethods.capitalize("aBcDe");
		System.out.println("The word " + "aBcDe" + " becomes " + properCapitals);
		
		//Where's Waldo
		String sentence = "Where in the world is Waldo";
		int waldoIndex = StringMethods.wheresWaldo(sentence);
		System.out.println("In the phrase \"" + sentence + "\" Waldo appears at index " + waldoIndex);

		//First Thinkgs First
		String toPrint = StringMethods.firstThingsFirst("blanket", "panda");
		System.out.println(toPrint);
		String toPrint2 = StringMethods.firstThingsFirst("Sandy", "bottom");
		System.out.println(toPrint2);
		
		//Reverse
		String s = "tacocat is a palindrome";
		StringBuilder reverseS = StringMethods.reverse(s);
		System.out.println("The reverse of " + s + " is " + reverseS);
		
		//So longs
		StringMethods.soLong("super", "calif");
		StringMethods.soLong("supercalifradulistic", "expialidocious");
		
		//After math
		String itWorks = StringMethods.afterMath("I love math so much!");
		System.out.println(itWorks);
		String itDoesnt = StringMethods.afterMath("I'm more of a history guy myself.");
		System.out.println(itDoesnt);
		
		//letterize
		StringMethods.letterize("Spelling");
	}
	
	

}
