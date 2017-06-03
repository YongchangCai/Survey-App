import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class MatchingQuestion extends Question {

	protected List<String> matching_list_1 = new ArrayList<String>();
	protected List<String> matching_list_2 = new ArrayList<String>();
	public MatchingQuestion(String Question) {
		super(Question);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Matching";
	}

	
	public void addMatching(String match1,String match2){
		matching_list_1.add(match1);
		matching_list_2.add(match2);
	}
	
	public String printMatch(){
		String matching ="";
		List<String> cp_matching_list_2 = matching_list_2;
		Collections.shuffle(cp_matching_list_2);
		for(int i = 0;i<matching_list_1.size();i++){
			matching += String.format("%1$10s", matching_list_1.get(i));
			matching += cp_matching_list_2.get(i)+"/n";
		}
		return matching;
	}
	
	@Override
	public String printQuestion() {
	String question = "";
		question += getQuestion()+"\n";
		question += printMatch();
		
		return question;
	}

}
