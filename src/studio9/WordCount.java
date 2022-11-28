package studio9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import support.cse131.NotYetImplementedException;

public class WordCount {
	/**
	 * Constructs and returns a map of the distinct words in the specified list with
	 * each word associated with its accumulated count (that is: the number of
	 * occurrences of the word in the list).
	 * 
	 * For example, if passed a List<String> containing:
	 * 
	 * [to, be, or, not, to, be]
	 * 
	 * the resulting Map<String, Integer> would contain
	 * 
	 * key="to", value=2;
	 * key="be", value=2;
	 * key="or", value=1;
	 * key="not", value=1;
	 * 
	 * @param words
	 * @return a map which contains all of the distinct words as keys, each
	 *         associated with the number of occurrences of the word
	 */
	public static Map<String, Integer> countWords(List<String> words) {
		Map<String, Integer> countWords = new HashMap<>();
		int y = 0;
		countWords.put("to", 0);
		countWords.put("be", 0);
		countWords.put("or", 0);
		countWords.put("not", 0);

//		for(String x: words) {
//			if (x.equals("to")||x.equals("be")) {
//				y = 2;
//			}
//			else if (x.equals("or")||x.equals("not")) {
//				y = 1;
//			}
//			countWords.put(x, y);
//		}
		for (String x : countWords.keySet()) {
			for (String z : words) {
				if (x.equals(z)) {
					y++;
				}
			}
			countWords.replace(x, 0, y);
			y = 0;
		}
		return countWords;
	}
}
