package spring_core_q2;

import java.util.Collection;
import java.util.Map;

public class Question {
	int Questionid;
	String Question;
	Map<Integer,String> ans;
	Collection<String>ans1;
	
	public Question(int questionid , String question, Map<Integer,String>ans) {
		Questionid = questionid;
		Question = question;
		this.ans = ans;
	}
	Question(int questionid, String question, Collection<String> ans1){
		Questionid = questionid;
		Question = question;
		this.ans1 = ans1;
	}
	public void DisplayAnswer() {
		System.out.println(ans);
	}
	void DisplayAnswer1() {
		System.out.println(ans1);
	}
	@Override
	public String toString() {
		return "Question [Questionid=" + Questionid + ", Question=" + Question + ", Answer=" + ans + "]";
	}
	public String toStringColl() {
		return "Question [Questionid=" + Questionid + ", Question=" + Question + ", answers=" + ans1 + "]";
	}

}
