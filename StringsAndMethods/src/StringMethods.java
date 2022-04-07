
public class StringMethods {
	public static String capitalize(String word) {
		String newWord = word.substring(0, 1).toUpperCase() + word.substring(1, word.length()).toLowerCase();
		return newWord;
	}
	
	public static int wheresWaldo(String phrase) {
		int waldoIndex = phrase.indexOf("Waldo");
		return waldoIndex;
	}
	
	public static String firstThingsFirst(String a, String b) {
		if (a.toLowerCase().compareTo(b.toLowerCase()) < 0) {
			String newString = a + " " + b;
			return newString;
		} else {
			String newString = b + " " + a;
			return newString;
}
	}
	
	public static StringBuilder reverse(String s) {
		StringBuilder reverseS = new StringBuilder(s);
		reverseS.reverse();
		return reverseS;
	}
	
	public static void soLong(String a, String b) {
		if (a.length() > b.length()) {
			System.out.println(a);
		} else if (a.length() == b.length()) {
			System.out.println(a + " " + b);
		} else {
			System.out.println(b);
		}
	}
	
	public static String afterMath(String phrase) {
		int indexIs = phrase.indexOf("math");
		if (phrase.indexOf("math") != -1) {
			return phrase.substring(indexIs, phrase.length());
		} else {
			return "dud";
		}
	}
	
	public static void letterize(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
}
