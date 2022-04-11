package lamda_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class word{
	String words;
	public word(String words) {
		super();
		this.words=words;
	}
	public void setword(String words) {
		this.words= words;
	}
	public String getword() {
		return words;
	}
	public String toString() {
		return words;
		
	}
}
public class Q4 {
	public static void main(String[] args) {
		word word1 = new word("Rishitha");
		word word2 = new word("Siri");
		word word3 = new word("Varshitha");
		word word4 = new word("Hasini");
		word word5 = new word("Anand");
		
		List<word> wordsList = new ArrayList<>();
		wordsList.add(word1);
		wordsList.add(word2);
		wordsList.add(word3);
		wordsList.add(word4);
		wordsList.add(word5);
		
		
		PrintWords(wordsList,p->p.getword().length()%2!=0);

	}
	private static void PrintWords(List<word> wordsList,Predicate<word> predicate) {
		wordsList.removeIf(predicate);
		for(word words:wordsList) {
			
			System.out.println(words);
		}
	}


}
